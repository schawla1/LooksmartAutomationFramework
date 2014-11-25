package com.looksmart.pages;

import com.looksmart.selencommands.Commands;

public class RegisterPage {
	Commands commands=new Commands();
	BaseClass baseClass=new BaseClass();
	
	public void register()
	{
		baseClass.getObjectRepository();
		baseClass.getDataSets();
		commands.waitForElementPresentXpath(baseClass.nextButtonXpath);
	commands.sendKeys(baseClass.signuppasswordTextFieldId, baseClass.signuppasswordTextFieldData);
	commands.sendKeys(baseClass.confirmPasswordTextFieldId, baseClass.confirmPasswordTextFieldData);
	commands.click(baseClass.nextButtonXpath);
	}

}
