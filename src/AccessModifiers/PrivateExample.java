package AccessModifiers;

public class PrivateExample {

	public static void main(String[] args) {
		PrivateExample pe=new PrivateExample();
		pe.add();

	}

	private void add() {
		System.out.println("Private add Method");
	}
}
