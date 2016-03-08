package com.selfpro.velankani;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class  Clickonhighlights1 
{
	 public static void main(String[] args) throws InterruptedException 
	  {
		 
	/*	 FirefoxProfile profile = new FirefoxProfile();
		 profile.setPreference("font.size.fixed.x-western",16);
		 profile.setPreference("font.minimum-size.x-western",13); */
		 
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 
	   // Dimension dim = new Dimension(1032, 600);
	  //  driver.manage().window().setSize(dim); 
		 

	/*	 System.setProperty("webdriver.chrome.driver", "D:\\selenium files\\chrome driver\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();   */
	     
	    driver.get("http://www.flipkart.com");
		 
		 
		/* String str1 = driver.getTitle();
		 System.out.println(str1);
		 
		 WebElement ele = driver.findElement(By.xpath(".//*[@id='fk-mainfooter-id']/div/div[4]/div[2]/div[4]/div[2]/a[6]")); 
		 // path for Dell laptop that is present at the bottom of the page	 
		 
		 
		 
         Point str2=  ele.getLocation(); // Getting the location
         System.out.println(str2);  */
 
                
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollTo(619, 5000)"); // Scrolling down by reducing the yOffset to 490 
	     
	    
		  
	 //    Thread.sleep(5000);
	  
		 //driver.findElement(By.xpath(".//*[@id='fk-mainfooter-id']/div/div[4]/div[2]/div[4]/div[2]/a[6]")).click();  
		  driver.findElement(By.linkText("| Dell Laptop")).click();
		// driver.findElement(By.linkText("Dell Laptop")).click();
		 
		 String str3 = driver.getTitle();
		 System.out.println(str3); // Printing the dell laptop title
		 	 
      }
}