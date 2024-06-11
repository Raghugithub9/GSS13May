package Exception;

public class TestException {

	public static void main(String[] args) {
	
		
	try {	
	System.out.println("Start");
	int a=10;
	int b=20;
	System.out.println(a/b);
	System.out.println("After Division");
	}
	catch(Exception e) {
		System.out.println("Catch Block");
	}
	finally{
		System.out.println("Finally Block");
	}
		
	
	
	
	
	
	}

}
