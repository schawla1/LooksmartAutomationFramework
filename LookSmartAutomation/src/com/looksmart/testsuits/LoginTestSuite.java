package com.looksmart.testsuits;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.looksmart.commoncommands.CommonCommand;
import com.looksmart.pages.BaseClass;
import com.looksmart.pages.CreateAdGroupPage;
import com.looksmart.pages.HomePage;
import com.looksmart.pages.LoginPage;
import com.looksmart.pages.RegisterPage;
import com.looksmart.pages.SignUpAdGroupPage;

public class LoginTestSuite {
	BaseClass baseClass=new BaseClass();
	LoginPage loginPage=new LoginPage();
	HomePage  homePage=new HomePage();
	CreateAdGroupPage createAdGroupPage=new CreateAdGroupPage();
	SignUpAdGroupPage signUpAdGroupPage=new SignUpAdGroupPage();
	RegisterPage registerPage=new RegisterPage();
	CommonCommand commonCommand=new CommonCommand();
	@BeforeClass
	public void openUrl()
	{
		baseClass.getQuery();
		baseClass.startUrl(baseClass.browser);
		//commonCommand.sqlQuery(baseClass.queryA);
		
	}
	@Test(priority=0,groups={"adgrouptest"})
	public void loginTest()
	{
		System.out.println("hi");
		loginPage.loginFunctionality();
	}
	@Test(groups={"adgrouptest"})
	public void clickAdGroup()
	{
		System.out.println("hello");
		homePage.adGroupSubmenu();
	}
@Test(dependsOnGroups={"adgrouptest"})
	public void createAdGroup()
	{
		createAdGroupPage.createAdGroup();
	}

	
	@AfterClass
	public void quit()
	{
		baseClass.driver.quit();
	}

}
