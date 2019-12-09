package com.capgemini.seleniumjava.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActiTimeLogin {

	static {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
	}

	@Test
	public void testOne() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		
		String expected = "actiTIME - Enter Time-Track";
		String actual = driver.getTitle();
		
		Assert.assertEquals(actual, expected);
		Thread.sleep(2000);
		driver.close();
		
	}

}
