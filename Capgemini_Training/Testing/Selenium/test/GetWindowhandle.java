package com.capgemini.seleniumjava.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowhandle {
	static {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String wh = driver.getWindowHandle();
		System.out.println(wh);
		
		//driver.get("https://www.naukri.com/");
		driver.get("https://www.naukri.com/");
		//driver.findElement(By.id("identifierId")).sendKeys("snehalpiit558@gmail.com");
		Set<String> whs = driver.getWindowHandles();
		System.out.println("number of windows : " +whs.size());
		System.out.println(whs);
		driver.quit();
	}

}
