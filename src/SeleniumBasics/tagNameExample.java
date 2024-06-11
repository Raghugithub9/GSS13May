package SeleniumBasics;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tagNameExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");//3.141.59
		WebDriver driver=new FirefoxDriver();
		
		//beyond 4.6 version of Selenium, no need system.setproperty, instead need WebDriverManager
		
		
		
		
driver.get("https://demo.guru99.com/test/newtours/");
		//d.get("https://linkedin.com");

//Navigate to BStackDemo Website
//driver.get("https://linkedin.com/");


//Finding all the available links on webpage
List<WebElement> links = driver.findElements(By.tagName("a"));


//Iterating each link and checking the response status
for (WebElement link : links) {
String url = link.getAttribute("href");

verifyLink(url);
}


//driver.quit();
}


public static void verifyLink(String url) {
try {
URL link = new URL(url);
HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
httpURLConnection.connect();


if (httpURLConnection.getResponseCode() == 200) {
System.out.println(url + " - " + httpURLConnection.getResponseMessage());
} else {
System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
}
} catch (Exception e) {
System.out.println(url + " - " + "is a broken link");
}
}
}