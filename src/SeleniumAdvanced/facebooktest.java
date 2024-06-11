package SeleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class facebooktest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://www.facebook.com/");
		Thread.sleep(5000);
		WebElement acclink=d.findElement(By.linkText("Create new account"));
		//WebElement acclink=d.findElement(By.xpath("//a[@id='u_0_0_5E']"));
		
		acclink.click();
		Thread.sleep(5000);
		WebElement date=d.findElement(By.name("birthday_day"));
		
		Select s=new Select(date);
		s.selectByIndex(14);
		
		
		d.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/span[1]/span[3]/input[1]")).click();

	}

}
