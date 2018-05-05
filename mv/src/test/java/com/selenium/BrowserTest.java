package com.selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;

public class BrowserTest {
	static String Browser = "IEDriverServer";
	static WebDriver driver;
 
  @BeforeMethod
  public void beforeMethod() {
	  if (Browser.contains("Chrome"))
	  {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	  }
	  else if(Browser.contains("IEDriverServer"))
	  {
		  System.setProperty("webdriver.ie.driver","D:\\Selenium\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
	  }
	   }
  
  
  
  @Test
  public void browserLaunch() {
	  driver.manage().window().maximize();
	  driver.get("https://www.softwaretestingmaterial.com/selenium-webdriver-script-in-chrome-browser/");


  }
  
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
