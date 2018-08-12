package com.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage {

	@FindBy(xpath = "//table[@class='textFieldsTable']/tbody/tr[1]/td[2]/input")
	private WebElement userName;

	@FindBy(xpath = "//table[@class='textFieldsTable']/tbody/tr[2]/td[2]/input")
	private WebElement password;

	@FindBy(id = "loginButton")
	private WebElement loginButton;

	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement loginCheckBox;

	@FindBy(xpath = "//table[@id='loginBox']/tbody/tr[3]/td[2]/table/tbody/tr/td[2]/div[2]/img")
	private WebElement logoVerify;

	public WebElement UserName() {
		return userName;
	}

	public WebElement Password() {
		return password;
	}

	public WebElement LoginButton() {
		return loginButton;
	}

	public WebElement LoginCheckBox() {
		return loginCheckBox;
	}

	public WebElement Logo() {
		return logoVerify;
	}

	/*@Test
	public void test() {
		// System.setProperty("webdriver.geckodriver.driver",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("http://127.0.0.1/login.do;jsessionid=lyfk4i1ihbka");

		LoginPage lp = PageFactory.initElements(d, LoginPage.class);

		lp.UserName().sendKeys("admin");
		lp.Password().sendKeys("manager");
		lp.LoginButton().click();

	}*/
}
