package ListenersDemo;		

	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;             		

@Listeners(ListenersDemo.ListenerTest.class)			

public class TestCases {				
WebDriver driver= new FirefoxDriver();					

//Test to pass as to verify listeners.		
@Test		
public void Login()				
{		
    driver.get("https://www.simplilearn.com");					
    							
    driver.findElement(By.linkText("Log in")).click();					
}		

//Forcefully failed this test as verify listener.		
@Test		
public void TestToFail()				
{		
    System.out.println("This method to test fail");					
    Assert.assertTrue(false);			
}		
}			