package ListenersDemo;		

import org.testng.ITestContext;		
import org.testng.ITestListener;		
import org.testng.ITestResult;		

public class ListenerTest implements ITestListener						
{		

    	
    public void onFinish(ITestContext Result) 					
    {		
    	
    	    System.out.println("The name of the testcase Finished is :"+Result.getName());					
    	   		         		
    }		

   		
    public void onStart(ITestContext Result)					
    {		
    	System.out.println("The name of the testcase Started is :"+Result.getName()); 		
    }		

   		
    public void onTestFailedButWithinSuccessPercentage(ITestResult Result)					
    {		
    	System.out.println("The name of the testcase Failed with Success is :"+Result.getName());	
    }		

    // When Test case get failed, this method is called.		
   		
    public void onTestFailure(ITestResult Result) 					
    {		
    System.out.println("The name of the testcase failed is :"+Result.getName());					
    }		

    // When Test case get Skipped, this method is called.		
    @Override		
    public void onTestSkipped(ITestResult Result)					
    {		
    System.out.println("The name of the testcase Skipped is :"+Result.getName());					
    }		

    // When Test case get Started, this method is called.		
    @Override		
    public void onTestStart(ITestResult Result)					
    {		
    System.out.println(Result.getName()+" test case started");					
    }		

    // When Test case get passed, this method is called.		
    @Override		
    public void onTestSuccess(ITestResult Result)					
    {		
    System.out.println("The name of the testcase passed is :"+Result.getName());					
    }	
    
    	

}			