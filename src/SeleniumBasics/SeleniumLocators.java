package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();	
		
		driver.get("https://www.linkedin.com/");
		WebElement user=driver.findElement(By.id("session_key"));
		user.sendKeys("TestUser1");
		
		//driver.findElement(By.id("session_key")).sendKeys("newtest");
		
//WebElement we=driver.findElement(By.className("nav__button-tertiary"));
//we.click();

//WebElement we=driver.findElement(By.xpath("/html/body/main/section[1]/div/form[1]/div[1]/div[1]/div/div/input"));

//WebElement we=driver.findElement(By.xpath("//*[@id=\"session_key\"]"));
//we.sendKeys("test@gmail.com");

//WebElement we=driver.findElement(By.cssSelector("#session_key"));
//we.sendKeys("newtest@gmail.com");

		WebElement pass=driver.findElement(By.name("session_password"));
		//WebElement pass=driver.findElement(By.className("text-color-text font-sans text-md outline-0 bg-color-transparent grow"));
		pass.sendKeys("Password123");

		//WebElement forgot=driver.findElement(By.linkText("Forgot password?"));
		//WebElement forgot=driver.findElement(By.partialLinkText("Forgot"));
		//forgot.click();

	}

}
