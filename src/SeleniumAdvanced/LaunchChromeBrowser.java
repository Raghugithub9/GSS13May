package SeleniumAdvanced;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChromeBrowser {

	
	 WebDriver dr;
	
	public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.chrome.driver", "C://Users//lenovo//Desktop//Trainings//Selenium//Drivers//chromedriver_win32//chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver dr=new FirefoxDriver();
		
		dr.get("https://www.linkedin.com/");
		dr.manage().window().maximize();
		
	}

}
