package Exception;

public class TryCatchExample {

	public static void main(String[] args) {
		
		
try {
	System.out.println("Try block");
	int i=1;
	int j=1;
	System.out.println(j/i);
	System.out.println("Last line of Try block");//can't execute
	System.out.println("Start Array");
	
	
	
	System.out.println("Close Array");
}catch(Exception e) {
	e.printStackTrace();
	System.out.println("Catch block");
	
}
finally {
	System.out.println("Finally Blocked");
}
		

	}

}
