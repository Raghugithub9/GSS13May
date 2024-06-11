package SeleniumAdvanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp {

	 
public static void main(String[] args) throws InterruptedException {
		WebDriver fb;
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		fb=new ChromeDriver();//launch the browser	 
		fb.get("https://facebook.com");//Navigate to facebook
		fb.manage().window().maximize();//maximize the window

		WebElement CnewAcc=fb.findElement(By.linkText("Create New Account"));
		CnewAcc.click();
		
fb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//text fields
fb.findElement(By.name("firstname")).sendKeys("Raghu");

fb.findElement(By.name("lastname")).sendKeys("Prasad");

fb.findElement(By.name("reg_email__")).sendKeys("raghu.sdet.trainer@gmail.com");
fb.findElement(By.name("reg_email_confirmation__")).sendKeys("raghu.sdet.trainer@gmail.com");
fb.findElement(By.name("reg_passwd__")).sendKeys("Raghu4567");

WebElement days=fb.findElement(By.id("day"));
//static drop down
Select s = new Select(days);
Thread.sleep(1000);
s.selectByVisibleText("10");

//Month drop down
Select s1 = new Select(fb.findElement(By.id("month")));
Thread.sleep(1000);
s1.selectByValue("6");

//Year drop down
Select s2 = new Select(fb.findElement(By.id("year")));
Thread.sleep(1000);
s2.selectByValue("1993");


//radio button
    fb.findElement(By.xpath("//input[@value='2']")).click();//for selecting male

fb.findElement(By.name("websubmit")).click();

//fb.close();
	}

}
