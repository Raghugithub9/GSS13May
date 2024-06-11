package PageFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class POMExample {

	//@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.geckodriver", "geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		By firstName=By.id("email");
		By passWord=By.name("pass");
		By forpass=By.linkText("Forgotten password?");
		
		driver.get("https://facebook.com");
		driver.findElement(firstName).sendKeys("test123");
		//driver.findElement(By.id("email")).sendKeys("new");
		driver.findElement(passWord).sendKeys("newtest");
		driver.findElement(forpass).click();
	
		//WebDriver d;
		
	
		
		
	}

}

