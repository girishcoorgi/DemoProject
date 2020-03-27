package com.Everest.DemoProject;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
 
public class TestChrome {
 
public static void main(String[] args) {
 
System.setProperty("webdriver.chrome.driver", "C:\\Users\\gpmonnappa\\Desktop\\Girish Data\\Everest\\CICD\\Driver\\chromedriver.exe");
 
ChromeOptions options = new ChromeOptions();
options.setExperimentalOption("useAutomationExtension", false);
// Initialize browser
WebDriver driver=new ChromeDriver(options);
 
// Open facebook
driver.get("http://www.facebook.com");
 
// Maximize browser
 
driver.manage().window().maximize();
 
}
 
}
