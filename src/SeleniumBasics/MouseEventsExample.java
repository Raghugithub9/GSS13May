package SeleniumBasics;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEventsExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://Users//lenovo//Desktop//geckodriver-v0.31.0-win64//geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		
		
		d.get("https://www.amazon.com");
		d.manage().window().maximize();
		
		
		//Implicit, explicit and fluent wait
		//d.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		Actions ac=new Actions(d);
		
	WebElement e1=d.findElement(By.xpath("//*[@id='nav-link-accountList']"));
	
	ac.moveToElement(e1).build().perform();
	
	d.findElement(By.linkText("Start here.")).click();

	}

}
