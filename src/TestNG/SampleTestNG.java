package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestNG {
	
		/*
		 * Before - Pre-requisite
		@BeforeSuite
			@BeforeTest
				@BeforeClass
					@BeforeMethod
						@Test //test case 1
					@AfterMethod
					@BeforeMethod
						@Test //test case 2
					@AfterMethod
				@AfterClass
			@AfterTest
		@AfterSuite

		After - Post requisite

		*/
			@Test //Test Case
			public void Test1(){
				System.out.println("Test1");
			}
			
			@Test(groups = {"Sanity"}) //Test Case
			public void Test2(){
				System.out.println("Test2");
			}
			@AfterSuite
			public void afterSuite(){
				System.out.println("afterSuite");
			}
		@BeforeSuite
		public void beforeSuite(){
			System.out.println("beforeSuite");
		}

		@BeforeTest
		public void beforeTest(){
			System.out.println("beforeTest*******************");
		}
		@AfterTest
		public void afterTest(){
			System.out.println("afterTest******************");
		}
		@BeforeClass
		public void beforeClass(){
			System.out.println("beforeClass");
		}
		@AfterClass
		public void afterClass(){
			System.out.println("afterClass");
		}
		@BeforeMethod
		public void beforeMethod(){
			System.out.println("Same beforeMethod");
		}
		@AfterMethod
		public void afterMethod(){
			System.out.println("Same afterMethod");
		}

}
