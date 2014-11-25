package com.looksmart.testsuits;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.looksmart.pages.BaseClass;
import com.looksmart.pages.LoginPage;
import com.looksmart.pages.RegisterPage;
import com.looksmart.pages.SignUpAdGroupPage;
import com.looksmart.selencommands.Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class SignUpTestSuite {
	public static WebDriver driver;	
	BaseClass baseClass=new BaseClass();
	LoginPage loginPage=new LoginPage();
	RegisterPage registerPage=new RegisterPage();
	SignUpAdGroupPage signUpAdGroupPage=new SignUpAdGroupPage();
	Commands commands=new Commands();
	@BeforeClass
	public void openUrl()
	{
		
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
	}
	@Test
	public void signUp()
	{
		System.out.println("signUpTest");
		
//		loginPage.signUp();
//		registerPage.register();
//		driver.get(baseClass.appUrl);
		//signUpAdGroupPage.signUpAdGroup();
	}
	@AfterClass
	public void quit()
	{
		driver.quit();
	}

}
