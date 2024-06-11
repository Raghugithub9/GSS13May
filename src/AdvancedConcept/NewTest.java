package AdvancedConcept;

import AccessModifiers.ProtectedExample;

public class NewTest extends ProtectedExample{

	public static void main(String[] args) {
		ProtectedExample pe=new ProtectedExample();
		//pe.print();
		NewTest nt=new NewTest();
		//nt.print();
		
		
		ConstructorExample geek1 = new ConstructorExample("avinash", 68);
        System.out.println("GeekName :" + geek1.name
                           + " and GeekId :" + geek1.id);

	}

}
