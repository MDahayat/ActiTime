package com.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import com.pageObject.LoginPage;

public class Base {

	public WebDriver driver;
	public LoginPage loginPage;
	
	public WebDriver launchBrowser(String browserType) {
		System.out.println("Launching Browser");
		switch (browserType) {
		case "chrome":

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webDriver.geckodriver.driver",
					System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("Browser type is not supported, hence lunching the default browser");
			System.setProperty("webDriver.geckodriver.driver",
					System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		//test
	}

	public void launchApplication(String url) {
		System.out.println("Launching Application url:"+url);
		driver.get(url);
	}
}
