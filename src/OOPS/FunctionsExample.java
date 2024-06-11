package OOPS;

public class FunctionsExample {

	public static void main(String[] args) { //main functions
		
		FunctionsExample fe=new FunctionsExample();
		fe.add();
		fe.sub();
		add();
		FunctionsExample.add();

	}

	//static function
	public static void add() {
		System.out.println("add function");
	}
	
	//non static function
	public void sub() {
		System.out.println("sub function");
	}
	
}
