
public class FunctionsExample {

	public static void main(String[] args) {
	
		add();
		FunctionsExample.add();
		//sub();
		FunctionsExample fe1=new FunctionsExample();
		FunctionsExample fe2=new FunctionsExample();
		
		fe1.sub();
		fe1.add();
		fe2.add();
		fe2.sub();
		
		
		//fe - object reference
		//new FunctionsExample() - object
		//fe.sub();
		//new FunctionsExample().sub();
	}
//static
public static void add() {
	System.out.println("Addition Function");
}

//non static
public void sub() {
	System.out.println("Subtraction Function");
}

	
}
