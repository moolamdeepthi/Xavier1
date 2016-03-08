package com.selenium.velankani;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assg {
	
	public String baseurl = "http://www.velankani.com";
	public WebDriver driver = new FirefoxDriver();
	public String expectedTitle = null;
	public String actualTitle = null;
	
	@BeforeTest
	
	public void setBaseUrl(){
	driver.get(baseurl);
	driver.manage().window().maximize();
	
	}
	
	@Test(priority=0)
	
	public void VerifyHomepageTitle(){
	
		 expectedTitle = "Telecom Consulting and Network Management Solutions";
		 actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		//System.out.println(actualTitle);
	}
	@Test(priority=1)
	
	public void webPage1(){
		driver.findElement(By.id("menu-solutions")).click();
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
		driver.findElement(By.id("menu-engineeringconsulting")).click();
		expectedTitle = "Engineering Consulting | Network Management | Solutions | Services";
		 actualTitle = driver.getTitle();
	     Assert.assertEquals(expectedTitle, actualTitle);
		}
	@Test(priority=2)	
	
	public void webPage2(){
		driver.findElement(By.id("menu-products")).click();
		driver.manage().timeouts().implicitlyWait(5,  TimeUnit.SECONDS);
		driver.findElement(By.id("menu-nocvue")).click();
		expectedTitle= "Network Management Systems | Consulting | Planning | Processors | NMS";
		actualTitle= driver.getTitle();
		//System.out.println(actualTitle);
		
		 Assert.assertEquals(expectedTitle,actualTitle);
	}
		
	@Test(priority=3)
	
	public void webPage3(){
		driver.findElement(By.id("menu-company")).click();;
		driver.manage().timeouts().implicitlyWait(5,  TimeUnit.SECONDS);
		//driver.findElement(By.id("menu-leadership")).click();
	    expectedTitle = "Velankani Communications Technologies";
	    actualTitle = driver.getTitle();
	    System.out.println(actualTitle);
	    Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	@Test(priority=4)
	
	public void webPage(){
		driver.findElement(By.id("menu-resources")).click();
		
		 expectedTitle = "Communications Technologies Solutions | Company | Companies";
		    actualTitle = driver.getTitle();
		   // System.out.println(actualTitle);
		    Assert.assertEquals(expectedTitle, actualTitle);
	
	
	}
	
	@Test(priority=6)
	public void webPage4(){
		driver.findElement(By.id("menu-careers")).click();
		expectedTitle = "Telecom product development careers";
	    actualTitle = driver.getTitle();
	  //  System.out.println(actualTitle);
	    Assert.assertEquals(expectedTitle, actualTitle);
		
	}
		@Test(priority=5)
		public void webPage5(){
			driver.findElement(By.id("menu-contact-us")).click();
			expectedTitle = "Information Technology | Information Technology Services | Solutions";
		    actualTitle = driver.getTitle();
		   // System.out.println(actualTitle);
		    Assert.assertEquals(expectedTitle, actualTitle);
		}
		
		
	@AfterTest
	public void terminateBrowser(){
		driver.quit();
	}
		
	

}

