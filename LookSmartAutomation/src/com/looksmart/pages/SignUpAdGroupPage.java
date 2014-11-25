package com.looksmart.pages;

import com.looksmart.selencommands.Commands;

public class SignUpAdGroupPage {
	Commands commands=new Commands();
	BaseClass baseClass=new BaseClass();
	
	
	public void signUpAdGroup()
	{
		baseClass.getObjectRepository();
		baseClass.getDataSets();
		commands.waitForElementPresentXpath(baseClass.submitButtonXpath);
		commands.sendKeys(baseClass.titleFieldId, baseClass.titleFieldData);
		commands.sendKeys(baseClass.descritionFieldId, baseClass.descriptionFieldData);
		Commands.sendKeys(baseClass.displayUrlFieldId, baseClass.displayUrlFieldData);
		//Commands.sendKeys(baseClass.destinationUrlField, baseClass.descriptionFieldData);
		Commands.sendKeys(baseClass.broadMatchTextId, baseClass.broadMatchTextData);
		Commands.sendKeys(baseClass.monthlyBudgetTextFieldId, baseClass.monthlyBudgetTextFieldData);
		Commands.click(baseClass.submitButtonXpath);
	}

}
