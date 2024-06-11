package SeleniumAdvanced;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://Users//lenovo//Desktop//Trainings//Selenium//Drivers//geckodriver-v0.31.0-win64//geckodriver.exe");

	
	WebDriver fr=new FirefoxDriver();

		fr.get("https://www.linkedin.com/");

		fr.close();
	}

}
