package OOPS;

public class FunctionswithParam {

	public static void main(String[] args) {
		add();
		add(100,200);
		add(200,"Java");
		sub(123,234);
		add(234);

	}

public static void add(){
	//int d;//declaration
	int a=10;//initialization
	int b=20;
	int c=a+b;
	System.out.println(c);
}
public static void add(int a) {
	System.out.println(a);
}	
public static void add(int a, int b) {
	System.out.println(a+b);
}
public static void sub(int a, int b) {
	System.out.println(a+b);
}
public static void add(int a, String st) {
	System.out.println(a+st);
}


}
