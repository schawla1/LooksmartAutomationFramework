package com.looksmart.pages;



import com.looksmart.selencommands.Commands;
import com.looksmart.pages.BaseClass;



public class LoginPage {
//private String loginTextField="Email";

BaseClass baseClass=new BaseClass();

private String 	signInButton="//*[@class='btn-login']";

Commands commands=new Commands();




public void loginFunctionality()
{
	baseClass.getObjectRepository();
	System.out.println("1 id is :"+baseClass.loginTextFieldId+ "data is"+baseClass.loginId);
	commands.waitForElementPresentXpath(baseClass.logInButtonXpath);
	System.out.println("id is :"+baseClass.loginTextFieldId+ "data is"+baseClass.loginId);
	commands.sendKeys(baseClass.loginTextFieldId, baseClass.loginId);
	Commands.sleep("5000");
	commands.sendKeys(baseClass.loginpasswordTextFieldId, baseClass.loginPassword);
	//commands.alertHandle();
	Commands.click(baseClass.logInButtonXpath);
	//System.out.println("hi");
	//Commands.assertText(baseClass.admenuXpath, baseClass.adMenuText);
}
public void signUp()

{
	baseClass.getDataSets();
	baseClass.getObjectRepository();
	commands.sendKeys(baseClass.emailTextFieldId, baseClass.emailTextFieldData);
	commands.sendKeys(baseClass.phoneTextFieldId, baseClass.phoneTextFieldData);
	commands.sendKeys(baseClass.websiteUrlTextFieldId, baseClass.websiteUrlTextFieldData);
	commands.click(baseClass.getStartedButtonId);
	
}

}
