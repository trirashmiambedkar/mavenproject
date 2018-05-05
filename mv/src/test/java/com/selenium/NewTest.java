package com.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 

public class NewTest {
 
  @Test
  public void testBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");

	  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.softwaretestingmaterial.com/selenium-webdriver-script-in-chrome-browser/");
  driver.quit();

}
  
  
}