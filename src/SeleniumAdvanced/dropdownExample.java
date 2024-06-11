package SeleniumAdvanced;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("http://the-internet.herokuapp.com/dropdown");
		WebElement we=d.findElement(By.id("dropdown"));
		
		Select sl=new Select(we);
		
		List<WebElement> we1=sl.getOptions();
		for(WebElement st: we1) {
			System.out.println(st.getText());
		}
		
		sl.selectByVisibleText("Option 2");
	
		
	

	}

}
