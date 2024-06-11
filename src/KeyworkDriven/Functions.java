package KeyworkDriven;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class Functions {

	public static WebDriver driver;
	
	//Launch the browser
	public static void OpenBrowser(){
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver=new FirefoxDriver();
	}

	//Navigate to application
	public static void Navigate(String url){
		driver.get(url);
	}
	
	//Enter User name
	public static void Username(String locator,String value, String param){
		
			if(locator.equals("id")){
				driver.findElement(By.id(value)).sendKeys(param);
			}else if(locator.equals("name")){
				driver.findElement(By.name(value)).sendKeys(param);
			}else if(locator.equals("classname")){
				driver.findElement(By.className(value)).sendKeys(param);
			}else if(locator.equals("linkText")){
				driver.findElement(By.linkText(value)).sendKeys(param);
			}else if(locator.equals("partialLinkText")){
				driver.findElement(By.partialLinkText(value)).sendKeys(param);
			}
	}
	
	//Enter password
	public static void Password(String locator,String value, String param){
		
		if(locator.equals("id")){
			driver.findElement(By.id(value)).sendKeys(param);
		}else if(locator.equals("name")){
			driver.findElement(By.name(value)).sendKeys(param);
		}else if(locator.equals("classname")) {
			driver.findElement(By.className(value)).sendKeys(param);
		}
	}	
	
	//Click on SignIn
		public static void Click(String locator,String value){
			if(locator.equals("id")){
				driver.findElement(By.id(value)).click();
			}else if(locator.equals("name")){
				driver.findElement(By.name(value)).click();
			}else if(locator.equals("classname")) {
				driver.findElement(By.className(value)).click();
			}else if(locator.equals("linktext")) {
				driver.findElement(By.linkText(value)).click();
			
		}
		
	}
	
		//Verify result
		public static void VerifyText(String locator, String value,String param){
			
			String expected=param;
			String actual=driver.findElement(By.xpath(value)).getText();
			
			Assert.assertEquals(expected, actual);
			
		}
		
		
		
	
	
}

