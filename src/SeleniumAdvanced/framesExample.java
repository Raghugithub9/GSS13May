package SeleniumAdvanced;
import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesExample {

	
		static WebDriver d;	
		public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			d=new ChromeDriver();
	//d.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	
	d.get("https://the-internet.herokuapp.com/nested_frames");
	//d.switchTo().frame("packageListFrame");
	//d.switchTo().frame(0);
	d.switchTo().frame("frame-middle");
	
	d.findElement(By.linkText("org.openqa.selenium.cli")).click();
	
	d.switchTo().frame("frame-right");
	
	d.switchTo().frame("classFrame");
	
	


		}
		}


