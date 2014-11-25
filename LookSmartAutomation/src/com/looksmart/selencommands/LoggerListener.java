package com.looksmart.selencommands;

import java.io.File;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


import com.looksmart.pages.BaseClass;

public class LoggerListener implements ITestListener, WebDriverEventListener {
	// Called when the test-method execution starts
	BaseClass baseclass=new BaseClass();
	Commands commands=new Commands();
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test method started: " + result.getName() + " 	and time is: " + getCurrentTime());
	}

	// Called when the test-method execution is a success
	@Override
	public void onTestSuccess(ITestResult result) {
		Commands.screenShot(BaseClass.screenShotPath);
		System.out.println("Test method success: " + result.getName() + " 	 and time is: " + getCurrentTime());

	}

	// Called when the test-method execution fails
	@Override
	public void onTestFailure(ITestResult result) {

		Commands.screenShot(BaseClass.screenShotPath);
		System.out.println("Test method failed: " + result.getName() + "  	and time is: " + getCurrentTime());

	}

	// Called when the test-method is skipped

	@Override
	public void onTestSkipped(ITestResult result) {
		Commands.screenShot(BaseClass.screenShotPath);

		System.out.println("Test method skipped: " + result.getName() + "  	and time is: " + getCurrentTime());
	}

	// Called when the test-method fails within success percentage

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// Leaving blank

	}

	// Called when the test in xml suite starts

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test in a suite started: " + context.getName() + " 	 and time is: " + getCurrentTime());

	}

	// Called when the test in xml suite finishes

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test in a suite finished: " + context.getName() + " 	 and time is: " + getCurrentTime());

	}

	// Returns the current time when the method is called
	public String getCurrentTime() {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss:SSS");
		Date dt = new Date();
		return dateFormat.format(dt);
	}

	
	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onException(Throwable arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	
	
	

}