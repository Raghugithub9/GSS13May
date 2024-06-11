
public class concatCondition {

	public static void main(String[] args) {

int a=1000;

int b=200;

int d=3000;

String st="Java";

String st1="Course";

System.out.println(st+st1);
int c=a+b;

System.out.println(c);
System.out.println(st+a+b);
System.out.println(st+(a+b));

if(a>b) {
	System.out.println("a is greater "+a);
}else {
	System.out.println("b is greater "+b);
}

if(a>b & a>d) {
	System.out.println("a is greatest "+a);
}else if(b>d) {
	System.out.println("b is greatest "+b);
}else {
	System.out.println("d is greatest "+d);
}

	}

}
