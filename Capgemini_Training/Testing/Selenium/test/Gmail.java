package com.capgemini.seleniumjava.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	static {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		/*String wh = driver.getWindowHandle();
		System.out.println(wh);*/
		
		//driver.get("https://www.naukri.com/");
		driver.get("https://www.gmail.com");
		//enter valid user email
		driver.findElement(By.id("identifierId")).sendKeys("snehalpiit558@gmail.com");
		//click on next
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(10000);
		//enter valid password
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("17111997");
		//click on next
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//click on compose
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']"));
		/*Set<String> whs = driver.getWindowHandles();
		System.out.println("number of windows : " +whs.size());
		System.out.println(whs);*/
		//driver.quit();
	}
}
