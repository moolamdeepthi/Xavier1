package com.selfpro.velankani;




import java.util.Set;
import java.util.concurrent.TimeUnit;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;




public class Upload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://mail.blr.velankani.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#horde_user")).sendKeys("xavier.joseph");
		driver.findElement(By.id("horde_pass")).sendKeys("Amma1591amma!1");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.xpath(".//*[@id='horde-navigation']/div[1]/ul/li/div/a")).click();
		driver.findElement(By.xpath(".//*[@id='horde-navigation']/div[1]/ul/li/div/a")).click();
		//String winHandleBefore = driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/div[3]/div/div/div[3]/div/div/div[2]/div/div[2]/div[3]/div[2][@class='msgFrom sep']")).click();
		driver.findElement(By.xpath(".//*[@id='msg_newwin']/span")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> handles =  driver.getWindowHandles();
		   for(String windowHandle  : handles)
		       {
		       if(!windowHandle.equals(parentWindow))
		          {
		          driver.switchTo().window(windowHandle);
		driver.findElement(By.xpath(".//*[@ id='msgData']/div[1]/ul/li/a[@id='reply_link']")).click();
		System.out.println("selected");
	//	Actions action  = new Actions(driver);
      //  WebElement findFrom = driver.findElement(By.xpath(".//*[@id='identity']"));
      //  action.moveToElement(findFrom).build().perform();
		WebElement upload = driver.findElement(By.xpath(".//*[@id='upload']"));
		upload.click();
		upload.sendKeys("Libraries\\Documents\\code.txt");
	
       // driver.quit();
        
		}
        
	}
}
}

