package com.looksmart.selencommands;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.looksmart.commoncommands.CommonCommand;
import com.looksmart.pages.BaseClass;
import com.sun.jna.platform.FileUtils;
import com.looksmart.pages.BaseClass;

public class Commands extends BaseClass {
	CommonCommand commonCommand=new CommonCommand();

	public static void click(String locator) {

		element(locator).click();

	}

	public static void sendKeys(String locator, String sendKeys) {

		element(locator).sendKeys(sendKeys);
	}

	public static void clear(String locator) {
		element(locator).clear();
	}

	public static WebElement element(String locator) {
		System.out.println(locator);

		if (locator.startsWith("//") || locator.startsWith("/html")) {
			// System.out.println(locator);
			return driver.findElement(By.xpath(locator));
		}
		else if (locator.startsWith("["))
			return driver.findElement(By.cssSelector(locator));

		else {
			return driver.findElement(By.id(locator));
		}
	}

	public static void waitForElementPresentXpath(String locator)  {
		int count = 0;
		while (!(driver.findElements(By.xpath(locator)).size() > 0)) {
			count++;
			System.out.println(count);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (count > 60) {
				System.out.println("element not found");

				//throw new Exception("fail to display");
			}

		}

	}

	

	public static void sleep(String timeout) {
		try {
			int time = Integer.parseInt(timeout);

			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	public static void assertText(String locator, String expected) {
		String verify = driver.findElement(By.xpath(locator)).getText();
		Assert.assertEquals(verify, expected);
	}
	
	public void alertHandle()
	{
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	

	public static void screenShot(String path) {
//		CommonCommand.makeDirectory(path);
//		File file = new File(path);
//        System.out.println(file.getAbsolutePath());
//        File srcFile = ((TakesScreenshot) BaseClass.driver).getScreenshotAs(OutputType.FILE);
//        try {
//			org.apache.commons.io.FileUtils.copyFile(srcFile, new File(file.getAbsolutePath() + "/" + CommonCommand.dateFormat()));
//		System.out.println("date Format is "+ CommonCommand.dateFormat());	
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		System.out.println(path);
        
	}
	public void close()
	{
		driver.quit();
	}

	
	}
