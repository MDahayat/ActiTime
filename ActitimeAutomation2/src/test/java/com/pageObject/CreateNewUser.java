package com.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewUser 
{
	@FindBy(xpath="//table[@class='formTable']/tbody/tr[3]/td[1]/table/tbody/tr[5]/td[2]/table/tbody/tr/td[3]/input")
	public WebElement username;
	
	@FindBy(xpath="//table[@class='formTable']/tbody/tr[3]/td[1]/table/tbody/tr[9]/td[2]/table/tbody/tr[1]/td[3]/input")
	public WebElement firstUserName;
	
	@FindBy(xpath="//table[@class='formTable']/tbody/tr[3]/td[1]/table/tbody/tr[9]/td[2]/table/tbody/tr[2]/td[3]/input")
	public WebElement lastUserName;
	
	@FindBy(xpath="//table[@class='formTable']/tbody/tr[3]/td[1]/table/tbody/tr[9]/td[2]/table/tbody/tr[4]/td[3]/input")
	public WebElement Email;
	
	@FindBy(name="passwordText")
	public WebElement password;
	
	@FindBy(name="passwordTextRetype")
	public WebElement RetypePassword;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement createNewUserButton;

}
