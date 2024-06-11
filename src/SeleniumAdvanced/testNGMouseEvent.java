package SeleniumAdvanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGMouseEvent {

	WebDriver driver;
	@BeforeSuite
	public void beforeSuite(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	}
	@AfterSuite
	public void afterSuite(){
		System.out.println("afterSuite");
	}
	@BeforeTest
	public void beforeTest(){
		 driver=new ChromeDriver();
	}
	@AfterTest
	public void afterTest(){
		System.out.println("afterTest");
	}
	@BeforeClass
	public void beforeClass(){
		System.out.println("beforeClass");
	}
	@AfterClass
	public void afterClass(){
		System.out.println("afterClass");
	}
	@BeforeMethod
	public void beforeMethod(){
		driver.get("https://www.amazon.in");
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("afterMethod");
	}
	@Test
	public void Test1(){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		Actions act=new Actions(driver);
		WebElement we=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
		act.moveToElement(we).build().perform();
		driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[1]/span")).click();
	}
	


	
	
}
