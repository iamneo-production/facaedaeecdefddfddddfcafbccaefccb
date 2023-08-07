package com.examly.springapp;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;

public class SpringApplicationTests {

	public static void main(String[] args) {
		try{
		String url = "http://www.flipkart.com";
		ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new RemoteWebDriver(new URL("http://34.85.242.216:4444"), chromeOptions);
		driver.manage().window().maximize();
		driver.navigate().to("http://www.flipkart.com");
		String title = driver.getTitle();
		driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='text']"))
				.sendKeys("testuser@abc.com");

		driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='password']"))
				.sendKeys("Test@1234");

		driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//button[@type='submit']")).click();
		driver.quit();
		}catch (MalformedURLException e) {
            e.printStackTrace();
        }
	}

}