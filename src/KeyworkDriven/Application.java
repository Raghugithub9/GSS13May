package KeyworkDriven;


import java.io.IOException;

import org.testng.annotations.Test;

public class Application {

	@Test
	public void testapp() throws IOException, InterruptedException { 
		String [][] st=GetData.readexcel("TestData", "keyworddata");
	
	for(int i=1; i<st.length;i++){
		Thread.sleep(5000);
		switch(st[i][2]){
		
		case "launch":
			Functions.OpenBrowser();
		break;
		
		case "navigate":
			Functions.Navigate(st[i][5]);
		break;
		
		case "username":
			Functions.Username(st[i][3], st[i][4], st[i][5]);
			break;
		case "password":
			Functions.Password(st[i][3], st[i][4], st[i][5]);
		break;
		
		case "login":
			Functions.Click(st[i][3], st[i][4]);
		break;
		
			
			
		}
		
	}
	
	
	}
	
	
}
