
public class globalLocalvariables {

static int c=200;//global variable	
	
	public static void main(String[] args) {
		
int i=10;//local variable
System.out.println(i);
//System.out.println(j);
System.out.println(c);
//add();
	}

	public void add() {
		int j=100;//local variable
		System.out.println(j);
		System.out.println(c);
	}
	
}
