package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "Drivers//geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		//driver.get("https://www.linkedin.com/");
		
		//System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		//WebDriver d=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.xpath("//span[normalize-space()='Meta © 2024']"));
		System.out.println(e.getText());
		
	}

}
