package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webDriverManagerExample {

	public static void main(String[] args) {

		//WebDriverManager.chromedriver().setup();
		//WebDriverManager.iedriver().setup();
		//WebDriverManager.edgedriver().setup();
		//WebDriverManager.operadriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		
		
		//ChromeOptions chromeOptions = new ChromeOptions();
		//WebDriverManager.chromedriver().driverVersion("85.0.4183.38").setup();
		//WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.facebook.com");
		
		driver.quit();
	}

}
