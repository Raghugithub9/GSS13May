package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementLocatorExample {

	public static void main(String[] args) {
		
System.setProperty("webdriver.gecko.driver", "Drivers//geckodriver.exe");
		
		//launch browser
		WebDriver driver=new FirefoxDriver();
		
		//Navigate to application
		driver.get("https://www.linkedin.com/");
		
		//8 element locators
		
		//id
		//name
		//classname
		//linktext
		//partial link text
		//xpath
		//cssSelector
		
		//tagname - Multiple elements
		
		
		WebElement Email=driver.findElement(By.id("session_key"));
		Email.sendKeys("raghutest@gmail.com");
		
		//driver.findElement(By.id("session_key")).sendKeys("raghutest@gmail.com");
		
		//WebElement pwd=driver.findElement(By.name("session_password"));
		//pwd.sendKeys("Raghu!279");
		
		//Absolute Xpath
		//WebElement pwd1=driver.findElement(By.xpath("/html/body/main/section[1]/div/div/form[1]/div[1]/div[2]/div/div/input"));
		//pwd1.sendKeys("newTest12");
		
		//Relative xpath
		//WebElement pwd1=driver.findElement(By.xpath("//*[@id=\"session_password\"]"));
		//pwd1.sendKeys("newTest12");
		
		//cssSelector
		WebElement pwd1=driver.findElement(By.cssSelector("#session_password"));
		pwd1.sendKeys("newTest12");
		
		
		
		//WebElement pwd1=driver.findElement(By.className("text-color-text font-sans text-md outline-0 bg-color-transparent grow"));
		//pwd1.sendKeys("NewTest123");
		
		
		//WebElement gmail=driver.findElement(By.className("lazy-loaded"));
		//gmail.click();
		
		//WebElement fgpwd=driver.findElement(By.linkText("Forgot password?"));
		//fgpwd.click();
		
		//WebElement fgpwd1=driver.findElement(By.partialLinkText("Forgot"));
		//fgpwd1.click();
		
		
		
	}

}
