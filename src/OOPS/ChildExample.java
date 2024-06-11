package OOPS;

public class ChildExample extends ParentExample{

	public static void main(String[] args) {
		
		ChildExample ce=new ChildExample();
		ce.NewPrint();
		ce.print();

	}

public void NewPrint() {
		System.out.println("New Print from Child");
	}	

public void NewPrint(String st) {
	System.out.println("New Print from Child");
}
public void print() {
	System.out.println("Child from Parent");
}

}
