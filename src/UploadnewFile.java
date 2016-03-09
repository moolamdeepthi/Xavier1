


	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.Toolkit;
	import java.awt.datatransfer.StringSelection;
	import java.awt.event.KeyEvent;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;


	public class UploadnewFile {

		public static void main(String[] args) throws AWTException, InterruptedException{
			// TODO Auto-generated method stub
			WebDriver driver = new FirefoxDriver();
			driver.navigate().to("http://mail.blr.velankani.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.cssSelector("#horde_user")).sendKeys("deepthi.moolam");
			driver.findElement(By.id("horde_pass")).sendKeys("deepthim333");
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
			System.out.println("Reply button is selected");
			WebElement upload = driver.findElement(By.xpath(".//*[@id='upload']"));
			upload.click();
			 StringSelection filepath = new StringSelection("Z:\\Capture.jpg");
			 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
			 Robot copypath = new Robot();
			 copypath.keyPress(KeyEvent.VK_ENTER);
			 copypath.keyRelease(KeyEvent.VK_ENTER);
			 Thread.sleep(5000);
			 System.out.println("");
			 copypath.keyPress(KeyEvent.VK_CONTROL);
			 copypath.keyPress(KeyEvent.VK_V);
			 copypath.keyRelease(KeyEvent.VK_CONTROL);
			 copypath.keyRelease(KeyEvent.VK_V);
			 Thread.sleep(5000);
			 System.out.println("filePath pasted in the Textbox");
			 copypath.keyPress(KeyEvent.VK_ENTER);
			 copypath.keyRelease(KeyEvent.VK_ENTER);
			
		}
			       System.out.println("File uploaded sucessfully");
			      System.out.println("File uploaded sucessfully");
			      System.out.println("two times printed");
			       System.out.println("uploaded sucessfully");   // new line//
			       System.out.println("completed");  // new added line//
	}
		}

	}




