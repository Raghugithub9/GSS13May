package SeleniumAdvanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	static WebDriver d;
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//d=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		
		d.get("https://demo.guru99.com/test/upload/");
		
	
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebElement fileUpload = d.findElement(By.xpath("//*[@id=\'uploadfile_0\']"));
		
		fileUpload.sendKeys("C://Users//lenovo//Desktop//FileUploadTest.txt");
		
		//C://Users//lenovo//Desktop//API.xls
		
		WebElement term=d.findElement(By.id("terms"));
		term.click();
		
		
		WebElement btn=d.findElement(By.id("submitbutton"));
		btn.click();
		
		d.close();

	}

}
