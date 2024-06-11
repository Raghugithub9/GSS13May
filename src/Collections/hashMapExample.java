package Collections;

import java.util.HashMap;
import java.util.Map;

public class hashMapExample {

	public static void main(String[] args) {

HashMap<String, Integer> hm=new HashMap<String, Integer>();

//(key, value)
hm.put("newtest", 1004);
hm.put("Neha", 1000);
hm.put("Abhishek", 1000);
hm.put("tript", 1002);
hm.put("new", 2003);
hm.put("infe", 1003);

		
System.out.println(hm.size());
System.out.println(hm.get("tript"));


for(Map.Entry abc: hm.entrySet()) {
	
	System.out.println(abc.getKey()+"  "+abc.getValue() );
	//System.out.println(str.getKey());
	
}

	}

}
