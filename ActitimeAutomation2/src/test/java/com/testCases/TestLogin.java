package com.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;

import com.Base.Base;
import com.pageObject.LoginPage;
import com.pojo.UserCredentials;

public class TestLogin {
	WebDriver driver;

	@DataProvider(name = "loginCredentialsDP")
	public Object[][] loginDP() {
		return new Object[][] { 
			{ new UserCredentials("admin", "manager", "Login with Valid Credentials", "1") },
			{ new UserCredentials("admin", "manager1", "Login with Invalid Credentials", "0") }
		};
	}

	@Test(dataProvider = "loginCredentialsDP")
	public void actiTimeLoginTest(UserCredentials userDetails) {
		System.out.println("<============Executing Test case:" + userDetails.getDescription() + "============>");
		Base base = new Base();
		driver = base.launchBrowser("firefox");
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		base.launchApplication("http://127.0.0.1/login.jsp");
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.UserName().sendKeys(userDetails.getUserName());
		loginPage.Password().sendKeys(userDetails.getPassword());
		loginPage.LoginButton().click();
	}
}
