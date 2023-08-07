package com.examly.springapp;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SpringApplicationTests {

	String url = "http://www.flipkart.com";
    ChromeOptions chromeOptions = new ChromeOptions();
	WebDriver driver = null;

	@BeforeTest
	public void beforeTest() throws Exception
	 {
		driver = new RemoteWebDriver(new URL("http://34.85.242.216:4444/"), chromeOptions);
	    driver.manage().window().maximize();
	}
	@Test
    public void Facebook() throws InterruptedException 
	{
        driver.navigate().to("http://www.flipkart.com");
		String title =driver.getTitle(); 
	}
    @Test
	public void loginToFlipkart() {
		driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='text']")).sendKeys("testuser@abc.com");
		
		driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='password']")).sendKeys("Test@1234");
		
		driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//button[@type='submit']")).click();
		
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}