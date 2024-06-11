package Collections;

import java.util.ArrayList;

public class arrayListExample{

	public static void main(String[] args) {
		

ArrayList<String> al=new ArrayList<String>();


al.add("Tosca");//0th index
al.add("Selenium");//1st index
al.add("UFT");//2nd index
al.add("JMeter");//3rd index
al.add("Loadrunner");//4th index
al.add("JMeter");//5rd index
al.add("Loadrunner");//6th index

System.out.println(al.get(0));
System.out.println(al.get(2));
System.out.println(al.get(1));
System.out.println(al.get(4));


System.out.println("Size of ArrayList is "+al.size());

//System.out.println(al.remove(3));
System.out.println(al.get(1));


for(int a=0;a<al.size();a++) {
	System.out.println("Value are "+al.get(a));
}

	}

}
