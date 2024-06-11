package AccessModifiers;

public class ProtectedExample {

	public static void main(String[] args) {
		ProtectedExample pe=new ProtectedExample();
		pe.print();

	}

	protected void print() {
		System.out.println("Protected Method");
	}
}
