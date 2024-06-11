package SeleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alertExample2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		
		
		d.get("http://the-internet.herokuapp.com/javascript_alerts");
		//d.findElement(By.xpath("//*[@id='content']/div/ul/li[1]/button")).click();
		
		
		//d.findElement(By.xpath("//*[@id='content']/div/ul/li[2]/button")).click();
		
		//d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.findElement(By.xpath("//*[@id='content']/div/ul/li[3]/button")).click();
		
		d.switchTo().alert().sendKeys("My Selenium Alert class");
	
		d.switchTo().alert().dismiss();
		
		
		//d.switchTo().alert().accept();

	}

}
