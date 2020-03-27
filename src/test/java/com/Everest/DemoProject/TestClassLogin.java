package com.Everest.DemoProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestClassLogin {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void launchdriver() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gpmonnappa\\Desktop\\Girish Data\\Everest\\CICD\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}
	
	@Test
	public void Test1() {
		
		driver.navigate().to("http://10.66.1.155:8065/#/");
		driver.findElement(By.id("email")).sendKeys("gpmonnappa@in.imshealth.com");
		driver.findElement(By.id("pwd")).sendKeys("Girish@987654321");
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/form/button")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Test1 Title is " +driver.getTitle());
		System.out.println("Test1 Username is " +driver.getCurrentUrl());
	}
	
	//@Test
	//public void Test2() {
		
	//	driver.navigate().to("http://www.google.com");
	//	System.out.println("Test2 Title is"+driver.getTitle());
	//}
	
	//@Test
	//public void Test3() {
		
	//	driver.navigate().to("http://www.google.com");
	//	System.out.println("Test3 Title is"+driver.getTitle());
	//}

	@AfterMethod
	public void quit() {
		driver.quit();
	}
	}


