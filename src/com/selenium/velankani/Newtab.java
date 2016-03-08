package com.selenium.velankani;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtab 
{
	public static void main(String[] args)throws Exception
	  {
	   //System.setProperty("webdriver.chrome.driver", "D:\\selenium files\\chrome driver\\chromedriver_win32\\chromedriver.exe");
     // WebDriver driv = new ChromeDriver();
	  // driv.manage().window().maximize();
	  // driv.get("http:www.google.com");
		
		Robot r = new Robot();	
		for (int i=0;i<411;i++)
		{
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		}
	     System.out.println("All tabs are opened");
		// driv.close();
	  }
}