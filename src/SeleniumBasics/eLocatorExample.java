package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class eLocatorExample {

	
//	public  void LinkedinTest() {
	
/*
Launch browser -Firefox
Open Linkedin

Enter Username
Enter Password
Click Singin
*/
		public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.linkedin.com/");

/*
Id
Name
ClassName
LinkText
PartialLinkText

TagName

Xpath
CssSelector
*/

WebElement user=driver.findElement(By.id("session_key"));
user.sendKeys("TestUser1");

WebElement pass=driver.findElement(By.name("session_password"));
pass.sendKeys("Password123");

WebElement forgot=driver.findElement(By.linkText("Forgot password?"));
//WebElement forgot=driver.findElement(By.partialLinkText("Forgot"));
forgot.click();

/*
String expected="Reset Password | LinkedIn";
String actual=driver.getTitle();

System.out.println(actual);

Assert.assertEquals(expected, actual);

WebElement forgotpass=driver.findElement(By.className("form__submit"));
forgotpass.click();

//driver.findElement(By.xpath(""))

*/

	}
	
}
