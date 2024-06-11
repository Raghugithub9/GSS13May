package OOPS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	
	static WebDriver d;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 d= new ChromeDriver();
		 d.get("http://demo.guru99.com/test/web-table-element.php"); 
		 d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 d.manage().window().maximize();
		 WebElement baseTable = d.findElement(By.tagName("table"));
		  
		 //To find third row of table
		 WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[5]/td[3]"));
         String rowtext = tableRow.getText();
		 System.out.println("Fifth row of table : "+rowtext);
		    
		 
		    //to get 3rd row's 2nd column data
		    WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
		    String valueIneed = cellIneed.getText();
		    System.out.println("Cell value is : " + valueIneed); 
		   
		
		
		
	}

}
