package com.Datadriven.velankani;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Datadrivenactitime 
{
	public static WebDriver driv;
	public static String username;
	public static String password;
 
 public static void openBrowser()
 {
	 try {
		   FileInputStream fis =new FileInputStream("D:\\selenium files\\Data driven\\Maindatadriven.xls");
		   Workbook wb= WorkbookFactory.create(fis);
		   Sheet sht= wb.getSheet("Sheet1");
		
		
		String data1 = sht.getRow(1).getCell(0).getStringCellValue();
		if(data1.equals("IE"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\selenium files\\IEDriverServer_Win32_2.52.0\\IEDriverServer.exe");
		    driv = new ChromeDriver();
			driv.manage().window().maximize(); 
			driv.get("http://localhost/login.do"); 
		}
		else if(data1.equals("GC"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\selenium files\\chrome driver\\chromedriver_win32\\chromedriver.exe");
			driv = new ChromeDriver();
			driv.manage().window().maximize(); 
			driv.get("http://localhost/login.do"); 
		}
		
		else
		{
		    driv = new FirefoxDriver();
			driv.manage().window().maximize(); 
			driv.get("http://localhost/login.do"); 
		}
	} catch (Exception  e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
 }
 
 public void getUserandPass(int i)
 {
	 FileInputStream fis;
	try {
		fis = new FileInputStream("D:\\selenium files\\Data driven\\Maindatadriven.xls");
        Workbook wb= WorkbookFactory.create(fis);
		Sheet sht= wb.getSheet("Sheet1");
	    String username = sht.getRow(i).getCell(1).getStringCellValue();
	    String password = sht.getRow(i).getCell(2).getStringCellValue();
	    this.username=username;
	    this.password=password;
	    System.out.println(username);
	    System.out.println(password);
	    
	} catch (Exception  e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
 
 public static void login() throws InterruptedException 
 {    
	 try{
    driv.findElement(By.id("username")).sendKeys(username);
    Thread.sleep(500);
	driv.findElement(By.cssSelector("input[name='pwd']")).sendKeys(password);
	Thread.sleep(500);
	driv.findElement(By.id("loginButton")).click();
	Thread.sleep(500);
	
 } catch (NoSuchElementException  e) {
		// TODO Auto-generated catch block
	e.printStackTrace();
	}

 }
public static void login() throws InterruptedException 
 {    
	 try{
    driv.findElement(By.id("username")).sendKeys(username);
    Thread.sleep(500);
	driv.findElement(By.cssSelector("input[name='pwd']")).sendKeys(password);
	Thread.sleep(500);
	driv.findElement(By.id("loginButton")).click();
	Thread.sleep(500);
 public static void getTitle(int i)
 {
 	try{
 	try {
 	
 	FileInputStream fis = new FileInputStream("D:\\selenium files\\Data driven\\Maindatadriven.xls");
 	Workbook wb = WorkbookFactory.create(fis);
 	Sheet sht = wb.getSheet("sheet1");


 	String acutaltitle= driv.getTitle();
 	String expectedtitle= "actiTIME - Enter Time-Track";
 	System.out.println(acutaltitle);
 	
 	if(acutaltitle.equals(expectedtitle))
 	{
 		
 		sht.getRow(i).createCell(5).setCellValue("Pass");
 	}
 	else{
 		
 		sht.getRow(i).createCell(5).setCellValue("Fail");
 	}
 	
 	sht.getRow(i).createCell(4).setCellValue(acutaltitle);
 	FileOutputStream fout= new  FileOutputStream("D:\\selenium files\\Data driven\\Maindatadriven.xls");
 	wb.write(fout);
 	 fout.close();
 	   
 	  driv.findElement(By.linkText("Logout")).click();
 	 
 	} catch(Throwable e) {
 	    e.printStackTrace();
 	    } 	
 	
 } catch(NoSuchElementException e) {
	    e.printStackTrace();
	    } 	

 }
 
public static void logOut()
{
	driv.close();
}
}
