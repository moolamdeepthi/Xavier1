package com.selfpro.velankani;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class Clickonhighlights 
{
  public static void main(String[] args) 
  {
	WebDriver driv = new FirefoxDriver();
	driv.manage().window().maximize();
	
	driv.get("http://www.flipkart.com/");
	//driv.findElement(By.cssSelector("a[data-tracking-id='RHS2']")).click();
	//driv.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	

	//driv.findElement(By.xpath("//div[3]/div[4]/div[3]")).click();
	//driv.findElement(By.xpath("//div[3]/div[2]/div[3]")).click();
    //WebElement element = driv.findElement(By.linkText("SAURA SPLASH 750 520 ml Sipper (Pack of 1, Green)"));
	
	//driv.findElement(By.cssSelector("a[data-tracking-id='RHS2']")).click();
	/*WebElement ele= driv.findElement(By.cssSelector("a[data-pid='CBREFY8VRPPGCYZ2']"));
    Actions a1 = new Actions(driv);
    a1.moveToElement(ele).click().perform();*/
    
	/*WebElement ele = driv.findElement(By.xpath("//i[contains(@class,'icon track-icon')]"));
	System.out.println(ele);
	Actions a1 = new Actions(driv);
	driv.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	a1.moveToElement(ele).click().perform();*/

	/*WebElement ele= driv.findElement(By.xpath(".//*[@id='fk-mainfooter-id']/div/div[2]/a/ul/li[1]/span"));
	System.out.println(ele);
	Actions a1 = new Actions(driv);
	driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    a1.moveToElement(ele).click().perform(); */
    
    WebElement ele = driv.findElement(By.linkText("| Dell Laptop"));
    driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    ele.click();
    
    driv.findElement(By.linkText("Report Infringement")).click();
  }
}
