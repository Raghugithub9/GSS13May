package SeleniumBasics;

import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class framesExample {

	
		static WebDriver d;	
		public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			d=new ChromeDriver();//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	//WebDriver d=new ChromeDriver();
	d.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	
	d.switchTo().frame("classFrame");
	
	d.findElement(By.linkText("org.openqa.selenium")).click();
	
		}
		}


