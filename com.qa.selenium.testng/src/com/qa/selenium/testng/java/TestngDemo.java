package com.qa.selenium.testng.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestngDemo {
	
     WebDriver driver;
     @Parameters("browserName")
     @BeforeTest
     public void open(String browserName)
     {
    	switch(browserName.toLowerCase())
    	{
    	case "chrome":
    		System.setProperty("webdriver.chrome.driver","D:\\seleniumdrivers\\chromedriver107.exe");
    		driver = new ChromeDriver();
    		break;
    	case "firefox":
    		System.setProperty("webdriver.gecko.driver", "C:\\Users\\R Hridhay\\OneDrive\\Desktop\\geckodriver.exe");
    		driver = new FirefoxDriver();
    		break;
    	default:
    		System.out.println("Please select correct browser");
    	
    	}
     }
     @Parameters("url")
     @Test
     public void urlOpen(String url)
     {
    	    driver.get(url);
    	    driver.manage().window().maximize();
    	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      }
     @Parameters({"userName","password"})
     @Test
     public void operation(String userName, String password)
     {
    	 

    	 driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys(userName);
    	 driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys(password);
    	 driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
     }
     @Test
     public void login ()
     {
    	 
     }
    
}
