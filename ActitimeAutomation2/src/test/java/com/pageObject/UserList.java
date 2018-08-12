package com.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserList 
{
	@FindBy(xpath="//table[@id='ext-gen21']/tbody/tr[3]/td[2]/div/span")
	private WebElement createNewUserButton;

}
