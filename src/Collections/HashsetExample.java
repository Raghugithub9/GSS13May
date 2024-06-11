package Collections;

import java.util.HashSet;

public class HashsetExample {

	public static void main(String[] args) {

//Duplicate are not allowed
//Sequence is not preserved
		
HashSet<Integer> hs=new HashSet();
hs.add(109);
hs.add(100);
hs.add(200);
hs.add(90);
hs.add(100);
hs.add(1000);



for(Integer t: hs) {
	System.out.println(t);
}
		

	}

}

