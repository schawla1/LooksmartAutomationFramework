package com.looksmart.pages;

import com.looksmart.selencommands.Commands;

public class ManageAdGroupPage {
	Commands commands=new Commands();
	BaseClass baseClass=new BaseClass();
public void manageAdGroup()
{
	baseClass.getObjectRepository();
	baseClass.getDataSets();
	Commands.sendKeys(baseClass.exactMatchTextId, baseClass.exactMatchTextData);
	Commands.sendKeys(baseClass.broadMatchTextId, baseClass.broadMatchTextData);
	Commands.click(baseClass.submitButtonId);
	
}
}
