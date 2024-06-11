package Collections;

import java.util.LinkedList;

public class linkedListExample {

	public static void main(String[] args) {

LinkedList<String> ls=new LinkedList<String>();

ls.add("India");//0th index
ls.add("Canada");//1st index
ls.add("Australia");//2nd index
ls.add("China");

ls.add("Australia1");
ls.add("China2");
ls.add("Australia2");
ls.add("China1");

ls.get(3);

System.out.println(ls.get(2));
System.out.println("Size of LinkedList "+ls.size());

	}
}
