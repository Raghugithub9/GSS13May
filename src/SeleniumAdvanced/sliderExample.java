package SeleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class sliderExample {
	
	 WebDriver driver;
	    @Test
	    public void scrolOptions() throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	        driver = new ChromeDriver();

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        driver.get("http://automationpractice.com/index.php?id_category=8&controller=category#/price-25.62-38.2");
	        driver.manage().window().maximize();
	        
	        Thread.sleep(5000);
	        WebElement Element = driver.findElement(By.id("layered_price_slider"));
	        //This will scroll the page till the element is found	
	          js.executeScript("arguments[0].scrollIntoView();", Element);
	        
	        Thread.sleep(4000);
	        WebElement leftslider=driver.findElement(By.xpath("//*[@id=\"layered_price_slider\"]/a[1]"));
	      WebElement sliderright= driver.findElement(By.xpath("//*[@id=\"layered_price_slider\"]/a[2]"));
	       Thread.sleep(4000);
	       for (int i = 1; i <= 10 ; i++) {
	    	   leftslider.sendKeys(Keys.ARROW_RIGHT);
	        }
	       for (int i = 1; i <= 5 ; i++) {
	    	   sliderright.sendKeys(Keys.ARROW_RIGHT);
	        }
	       
	    }
	}