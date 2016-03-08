package com.test.vel;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest 
{
  public static void main(String [] args)
  {
	    WebDriver driv = new FirefoxDriver();
	    
	    
	 //   System.setProperty("webdriver.chrome.driver", "D:\\selenium files\\chrome driver\\chromedriver_win32\\chromedriver.exe");
	  //   WebDriver driv = new ChromeDriver();
	     driv.manage().window().maximize();
	     
	    driv.get("http://localhost/support/popups/faqPopup.jsp");
	    
	    driv.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driv.switchTo().frame("contentFrame");
	    driv.findElement(By.linkText("How can I change the decimal separator in the amounts from ',' (comma) to '.' (dot)?")).click();
	    
  }
}
