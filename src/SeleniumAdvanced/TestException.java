package SeleniumAdvanced;

public class TestException {

	public static void main(String[] args) throws InterruptedException {
	
	try {
	final int a=10;
	//a=20;
	System.out.println("Initialised");
	int b=a/0;
	System.out.println("b value is "+b);
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
		System.out.println(e.getStackTrace());
	}
	
	finally{
		System.out.println("Success");
	}
	
Thread.sleep(3000);
	
	}

}
