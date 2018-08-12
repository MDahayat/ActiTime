package com.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage 
{
	@FindBy(xpath="//table[@id='topnav']/tbody/tr[1]/td[9]/a//img[@class='sizer']")
	private WebElement userImg;

	public WebElement getUserImg() {
		return userImg;
	}
	
	
	
	

}
