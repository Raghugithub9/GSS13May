package TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class NewTestNG {

	
	@Test(priority=1)
	public void Test1(){
		System.out.println("Test1");
	}
	
	@Test(priority=0)
	public void Test2(){
		System.out.println("Test2");
	}
	
	@Test(priority=2)
	public void Test3(){
		String st="Selenium";
		String at="TestNG";
		
		//if(st==at) {
			//System.out.println("st and at are equal");
		//}else {
		//	System.out.println("st and at are not equal");
		//}
		
		//assert.assertEquals(st, at);
		
	}
	
	
}
