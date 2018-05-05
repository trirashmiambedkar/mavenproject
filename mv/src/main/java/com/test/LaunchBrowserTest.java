package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.config.Readproperties;

public class LaunchBrowserTest {

	public static String Browser ;
	public static WebDriver driver;

	public static void main(String[] args) throws Exception
	{
		ReadBrowser();
		BrowserCOnfig();
	}

	public static void ReadBrowser() throws Exception
	{
		Readproperties.getpropertyfile();
	}

	public static void BrowserCOnfig() {
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

}
