package SeleniumBasics;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertExample {

     WebDriver driver;
    @Test
    public void ByPixel() throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
         driver = new FirefoxDriver();
        driver.get("http://amazon.in");
        //to maximize the browser
        driver.manage().window().maximize();
        
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Lenovo Laptop");
        driver.findElement(By.id("nav-search-submit-button")).click();
        
        
        String ActualTitle = driver.getTitle();
        System.out.println(ActualTitle);
        
        //Assertions
        String ExpectedTitle = "New page";
       Assert.assertEquals(ExpectedTitle, ActualTitle);
      /*  
        if(ExpectedTitle==ActualTitle) {
        	System.out.println("TC Passed");
        }else {
        	System.out.println("TC Failed");
        }
        //Comparison
        /*String st="Selenium";
    	String st1="Java";
    	if(st==st1) {
    		System.out.println("equal");
    	}else {
    		System.out.println("not equal");
    	}
        */
        
    }
}