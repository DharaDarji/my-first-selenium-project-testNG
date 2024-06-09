package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 

public class HomePageTest {
	
	public WebDriver driver;
	
	@Test
	public void goToHomePageTest() throws InterruptedException {
		
		System.out.println("Helloo");
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBox.sendKeys("Laptop");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@aria-label='laptop table']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Amazon Basics Engineered Wood Foldable Laptop Table with Cup Holder, Tablet Groove and Mini Drawer (Black)')]")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
