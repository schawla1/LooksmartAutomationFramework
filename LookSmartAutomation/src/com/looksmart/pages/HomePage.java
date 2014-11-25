package com.looksmart.pages;

import com.looksmart.selencommands.Commands;

public class HomePage {
	
	Commands commands=new Commands();
	BaseClass baseClass=new BaseClass();
	
	public void adGroupSubmenu()
	
	{
		baseClass.getObjectRepository();
		commands.waitForElementPresentXpath(baseClass.createAdGroupIconXpath);
		commands.click(baseClass.createAdGroupIconXpath);
		
	}
	public void clickLogout()
	{
		baseClass.getObjectRepository();
		commands.click(baseClass.signOutIconXpath);
	}

}
