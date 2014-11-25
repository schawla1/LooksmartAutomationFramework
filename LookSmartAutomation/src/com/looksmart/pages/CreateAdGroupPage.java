package com.looksmart.pages;

import com.looksmart.selencommands.Commands;

public class CreateAdGroupPage {
	Commands commands=new Commands();
	BaseClass baseClass=new BaseClass();

	public void createAdGroup()
	{
		baseClass.getObjectRepository();
		baseClass.getDataSets();
		commands.waitForElementPresentXpath("//*[@id='ad_group_name']");
		//commands.sleep("10000");
		commands.sendKeys(baseClass.adGroupNameFieldId, baseClass.adGroupNameFieldData);
		commands.sendKeys(baseClass.titleFieldId, baseClass.titleFieldData);
		commands.sleep("10000");
		commands.sendKeys(baseClass.descritionFieldId, baseClass.descriptionFieldData);
		commands.sendKeys(baseClass.destinationUrlField, baseClass.destinationUrlFieldData);
		commands.sendKeys(baseClass.displayUrlFieldId, baseClass.displayUrlFieldData);
		//commands.sendKeys(baseClass.destinationUrlField, baseClass.descritionFieldData);
		//commands.sleep("10000");
		commands.click(baseClass.continueButtonXpath);
		
		commands.sleep("20000");
		commands.sendKeys(baseClass.exactMatchTextId, baseClass.exactMatchFieldData);
		commands.sendKeys(baseClass.broadMatchTextId, baseClass.broadMatchFieldData);
		commands.click(baseClass.submitButtonId);
	}
}
