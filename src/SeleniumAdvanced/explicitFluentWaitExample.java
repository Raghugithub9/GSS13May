package SeleniumAdvanced;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class explicitFluentWaitExample {

	WebDriver d;

		
		@BeforeTest
		public void browserConfig() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 d=new ChromeDriver();
		}
		
		@SuppressWarnings("deprecation")
		@Test
		public void gmailLogin() throws InterruptedException {
		d.get("https://www.google.com/gmail/about/");
		d.manage().window().maximize();
		WebElement signin=d.findElement(By.linkText("Sign in"));
		signin.click();
		//Thread.sleep(5000);
		//d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement user=d.findElement(By.id("identifierId"));
		//user.sendKeys("raghu.sdet.trainer");
		//user.sendKeys("31122023");
		
		
		WebElement nextbtn=d.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/button"));
		nextbtn.click();
		
		WebElement remuser=d.findElement(By.id("recoveryIdentifierId"));
		remuser.sendKeys("raghu.sdet.test");
		
		//Implicit Wait
		//d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		//Explicit Wait
		WebDriverWait wdw=new WebDriverWait(d, 10);
		wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")));
		
		/*
		@SuppressWarnings("deprecation")
		Wait wait = (Wait) new FluentWait<WebDriver>(d)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(Exception.class)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")));
			*/
		
		Date da=new Date();
		
	
		
		Thread.sleep(5000);
		
		
				WebElement forlink=d.findElement(By.linkText("Forgot password?"));
				forlink.click();
			
				//WebElement btn1=d.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/span"));
				//btn1.click();
	

	}

}
