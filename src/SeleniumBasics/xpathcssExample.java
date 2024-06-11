package SeleniumBasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathcssExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver chrome=new ChromeDriver();
		

		chrome.get("https://www.linkedin.com/");
		chrome.manage().window().maximize();
		
		//xpath element locator
		//Absolute and Relative xpath
		
		//Absolute xpath
		WebElement user=chrome.findElement(By.xpath("//html/body/main/section/div/div/form/div[2]/div//input"));
		WebElement pass=chrome.findElement(By.xpath("//html/body/main/section/div/div/form/div[2]/div[2]/input"));
		
		//Relative xpath
		//WebElement signInbutn=chrome.findElement(By.xpath("//button[@class='sign-in-form__submit-button']"));
		
		WebElement joinNow=chrome.findElement(By.xpath("//a[@class='nav__button-tertiary btn-md btn-tertiary']"));
		
		
		user.sendKeys("new@gmail.com");
		pass.sendKeys("Raghu12345");
		//signInbutn.click();
		joinNow.click();
		
	}

}
