


	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.IOException;
	import org.apache.commons.io.FileUtils;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	
	
	public class DifferentWebsites {
	public	 WebDriver driver = new FirefoxDriver();
	public String expectedTitle = null;
	public String actualTitle = null;

	@BeforeMethod      

	public void page() throws AWTException{
		Robot newtab = new Robot();
		newtab.keyPress(KeyEvent.VK_CONTROL);
		newtab.keyPress(KeyEvent.VK_T);
		newtab.keyRelease(KeyEvent.VK_CONTROL);
		newtab.keyRelease(KeyEvent.VK_T);
	}
	@Test(priority=0)
	public void amazon(){
		driver.get("http://www.amazon.com");	
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("SDN books");
		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("Z:\\scr\\amazon.jpG"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test(priority=1)
	public void flipkart(){
		driver.get("http://www.flipkart.com");
		driver.findElement(By.xpath("//input[@id='fk-top-search-box']")).sendKeys("sdn books");;
		//driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);

		driver.findElement(By.xpath(".//*[@id='fk-header-search-form']/div/div/div[2]/input[1]")).click();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("Z:\\scr\\flipkart.jpG"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
		
	@Test(priority=4)
	 
	public void snapDeal(){
		driver.get("http://www.snapdeal.com");
			String Handlewindow=driver.getWindowHandle();
			driver.switchTo().window(Handlewindow);
			driver.findElement(By.id("pincode-salience-check")).sendKeys("560001");
			driver.findElement(By.xpath(".//*[@id='pincodeSalienceComponent']/div[2]/div[3]/div[2]/span")).click();
			driver.findElement(By.xpath(".//*[@id='sdHeader']/div[4]/div[2]/div[2]/input")).sendKeys("sdn books");
			driver.findElement(By.xpath(".//*[@id='sdHeader']/div[4]/div[2]/div[2]/button")).click();
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 try {
				 FileUtils.copyFile(scrFile, new File("Z:\\scr\\snapdeal.jpG"));
			 } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }
	}

	@Test(priority=2)
	public void ebay(){
		driver.get("http://www.ebay.com");
		driver.findElement(By.xpath(".//*[@id='gh-ac']")).sendKeys("sdn books");
		driver.findElement(By.xpath(".//*[@id='gh-btn']")).click();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("Z:\\scr\\ebay.jpG"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
	@Test(priority=5)
		
	public void Paytm() throws AWTException{

		driver.get("https://www.paytm.com");
		driver.findElement(By.id("input_1")).sendKeys("sdn books");
		Robot rr = new Robot();
		rr.keyPress(KeyEvent.VK_ENTER);
		rr.keyRelease(KeyEvent.VK_ENTER);

		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("Z:\\scr\\paytm5.jpG"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
	@Test(priority=6)
	public void indiaTimesshopping() throws AWTException{
		driver.get("http://shopping.indiatimes.com/");
		driver.findElement(By.id("globalSearch")).sendKeys("sdn books");
		Robot rr = new Robot();
		rr.keyPress(KeyEvent.VK_ENTER);
		rr.keyRelease(KeyEvent.VK_ENTER);

		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("Z:\\scr\\indiatime.jpG"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	@Test(priority=7)
	public void booksAdda(){
		driver.get("http://www.bookadda.com");
		driver.findElement(By.id("searchkey")).sendKeys("sdn books");
		driver.findElement(By.xpath(".//*[@id='searchForm']/table/tbody/tr/td/table/tbody/tr/td[3]/input")).click();

		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("Z:\\scr\\BooksAdda.jpG"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority=8)
	public void landmark(){
		driver.get("http://www.landmarkonthenet.com/");
		WebElement add = driver.findElement(By.id("TopSearch-categories"));
		Select ab = new Select(add);
		ab.selectByVisibleText("Books");
		driver.findElement(By.id("TopSearch")).sendKeys("sdn books");
		driver.findElement(By.xpath(".//*[@id='TopSearchForm']/ul/li[4]/button")).click();

		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("Z:\\scr\\landmark.jpG"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	}


