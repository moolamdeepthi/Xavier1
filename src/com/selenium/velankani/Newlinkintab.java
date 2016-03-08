package com.selenium.velankani;

import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Newlinkintab 
{
	public static void main(String[] args)throws Exception
	  {
		
	//System.setProperty("webdriver.chrome.driver", "D:\\selenium files\\chrome driver\\chromedriver_win32\\chromedriver.exe");
   // WebDriver driv = new ChromeDriver();
   // driv.manage().window().maximize();
    //driv.get("http://www.google.com");
    
    //String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
  //  System.out.println(selectLinkOpeninNewTab);
    
   /* Robot r = new Robot();
    r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_T);
	driv.get("https://www.wikipedia.org");*/
    
    /*Actions newTab = new Actions(driv);
    newTab.sendKeys(Keys.CONTROL + "t").perform();
    driv.get("https://www.wikipedia.org"); */
    
  
  //  driv.navigate().to("https://www.wikipedia.org");
  //  WebElement element = driv.findElement(By.cssSelector("body"));
   // System.out.println(element);
   // Actions actionOpenLinkInNewTab = new Actions(driv);
   // actionOpenLinkInNewTab.moveToElement(element).keyDown(Keys.CONTROL).click(element).keyUp(Keys.CONTROL).perform();
      }
      }
