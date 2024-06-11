package TestNG;


import org.testng.annotations.Test;

public class prioritytestNG {

@Test(priority=2)
public void login(){
	System.out.println("login feature");
}

@Test(priority=4)
public void logout(){
	System.out.println("logout feature");
}


@Test(groups = {"Sanity"},enabled=true)
public void sendEmail(){
	System.out.println("send email feature");
}

@Test(groups= {"Sanity","Regression"},enabled=true)
public void create(){
	System.out.println("create feature");
}
//***********************************************************************************************

@Test(groups = {"Sanity", "Regression"}, enabled=true, description = "This is my Sanity Test")
public void Sanity1(){
	System.out.println("Run group Sanity1");
}

@Test(groups = {"Sanity"}, enabled=true, description = "This is my Sanity Test")
public void Sanity2(){
	System.out.println("Run group Sanity2");
}
@Test(groups = {"Regression"}, enabled=true, description = "This is my Sanity Test")
public void Regression1(){
	System.out.println("Run group Regression1");
}
@Test(groups = {"Regression"}, enabled=true, description = "This is my Sanity Test")
public void Regression2(){
	System.out.println("Run group Regression2");
}

}
