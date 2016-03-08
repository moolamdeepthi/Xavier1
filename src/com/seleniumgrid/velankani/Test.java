package com.seleniumgrid.velankani;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test 
{
	public static void main(String [] args) throws MalformedURLException
	{
		DesiredCapabilities cap1 = new DesiredCapabilities();
		//cap1.setBrowserName("internet explorer");
		//cap1.setPlatform(Platform.WINDOWS);
		
		cap1.setBrowserName("chrome");
		cap1.setPlatform(Platform.WINDOWS);
		
	//	WebDriver driver1 = new RemoteWebDriver(new URL("http://10.0.4.53:5567/wd/hub"),cap1);
		
		WebDriver driver1 = new RemoteWebDriver(new URL("http://10.0.4.54:5568/wd/hub"),cap1);
		
		driver1.manage().window().maximize();
		   driver1.get("https://www.google.co.in");
		   String ele1=driver1.getTitle();
		   System.out.println(ele1); 
		
}
}