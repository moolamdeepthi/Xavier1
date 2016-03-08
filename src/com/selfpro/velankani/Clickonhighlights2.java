
package com.selfpro.velankani;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Clickonhighlights2 
{
	public static void main(String[] args) 
	  {
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("http://shopping.rediff.com/");
	     

		// driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-delete-sign']")).click();
		// driver.findElement(By.linkText("Dell Laptops")).click();
		 
		// driver.findElement(By.xpath(".//*[@id='fk-mainfooter-id']/div/div[1]/div[1]/div[2]/a[3]")).click();
		 driver.findElement(By.linkText("Dell Laptop")).click();
		 
	  }
}