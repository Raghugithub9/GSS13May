package SeleniumAdvanced;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alertExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		
		
		
		
		d.get("http://the-internet.herokuapp.com/javascript_alerts");			
		/*
		 * d.findElement(By.xpath("//*[@id='content']/div/ul/li[1]/button")).click();
		 
		String st=d.switchTo().alert().getText();
		System.out.println(st);
		d.switchTo().alert().accept();
		*/
		
		//d.findElement(By.xpath("//*[@id='content']/div/ul/li[2]/button")).click();
		
		//d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	d.findElement(By.xpath("//*[@id='content']/div/ul/li[3]/button")).click();
		
		d.switchTo().alert().sendKeys("My Selenium Alert class");
	
		d.switchTo().alert().
		//Wait Methods
		//Thread.sleep(3000);
		//d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Alert text copied into String variable
		//String st=d.switchTo().alert().getText();
		
		//accept
		//dismiss
		//sendkeys
		

	}

}
