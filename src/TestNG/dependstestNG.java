package TestNG;



import org.testng.annotations.Test;

public class dependstestNG {

@Test(dependsOnMethods={"createAccount"})
public void login(){
	System.out.println("login");
}

@Test
public void createAccount(){
	System.out.println("createAccount");
}

@Test(dependsOnMethods={"login","createAccount"})
public void sendEmail(){
	System.out.println("sendEmail");
}

	
}
