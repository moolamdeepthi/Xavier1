package com.assignment.velankani;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Googleperformance 
{
	public WebDriver driv= new FirefoxDriver();
	
	 
	@BeforeTest
	public void openBrowser()
    {
	   driv.manage().window().maximize();
	   driv.get("https://www.google.com");
	   
    }
	
	
 	
	@Test(priority=1)
	public void clickGmail()
	{
		driv.findElement(By.linkText("Gmail")).click();
		driv.navigate().back();
	}
	
	/*@Test(priority=2)
    public void clickImages()
    {
		driv.findElement(By.linkText("Images")).click();
		driv.navigate().back();
    }
	
	@Test(priority=3)
	public void clickSignin()
	{
		driv.findElement(By.linkText("Sign in")).click();
		driv.navigate().back();
	}
	
    @Test(priority=4)
    public void clickAdvertising()
    {
    	driv.findElement(By.linkText("Sign in")).click();
		driv.navigate().back();
    }
    
    @Test(priority=5)
    public void clickBusiness()
    {
    	driv.findElement(By.linkText("Business")).click();
		driv.navigate().back();
    }
    
    @Test(priority=6)
    public void clickAbout()
    {
    	driv.findElement(By.linkText("About")).click();
		driv.navigate().back();
    }
    
    @Test(priority=7)
    public void clickonPrivacy()
    {
    	driv.findElement(By.linkText("Privacy")).click();
		driv.navigate().back();
    }
    
    @Test(priority=8)
    public void clickTerms()
    {
    	driv.findElement(By.linkText("Terms")).click();
		driv.navigate().back();
    }
    
    @Test(priority=9)
    public void clickSettings()
    {
    	driv.findElement(By.linkText("Settings")).click();
		driv.navigate().back();
    }
    
    @Test(priority=10)
    public void clickonUseGooglecom()
    {
    	driv.findElement(By.linkText("Use Google.com")).click();
		driv.navigate().back();
    }
	
    @Test(priority=11)
    public void typeonSearchbox()
    {   
    	driv.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	driv.findElement(By.name("q")).sendKeys("velankani");
    	driv.findElement(By.name("btnG")).click();
    	driv.findElement(By.linkText("×")).click();
    	driv.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	                                                    
    }
   
     @Test(priority=12)
    public void clickonMaps()
    {
    	driv.findElement(By.linkText("Maps")).click();
    	driv.navigate().back();
    }
    
      @Test(priority=13)
    public void clickonImages()
    {
    	driv.findElement(By.linkText("Images")).click();
    	driv.navigate().back();
    }
    
    @Test(priority=14)
    public void clickonNews() throws Exception
    {
    	driv.findElement(By.linkText("News")).click();
    	Thread.sleep(1000);
    	driv.navigate().back();
    }
    
      @Test(priority=15)
    public void clickonVideos() throws Exception
    {
    	driv.findElement(By.linkText("Videos")).click();
    	Thread.sleep(1000);
    	driv.navigate().back();
    }
    
    @AfterTest
    public void closeBrowser()
    {
    	driv.close();
    } */
	
}
