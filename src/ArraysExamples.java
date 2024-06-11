
public class ArraysExamples {

	public static void main(String[] args) {

//one dimensional arrays
//two dimensional arrays
		
int i[] = new int[3];//index
i[0]=100;
i[1]=200;
i[2]=300;

//int ab=10;
//int cd=0;

//System.out.println(ab/cd);

String st[]=new String[2];
st[0]="Java1";
st[1]="Java2";

System.out.println(i[2]);

for(int j=0;j<2;j++) {//j=0
	System.out.println(st[j]);
}

//Two Dimensional
   //row-3,colum-4
int j[][] = new int[3][4];

j[0][0]=100;
j[0][1]=101;
j[0][2]=102;
j[0][3]=103;

j[1][0]=1000;
j[1][1]=1002;
j[1][2]=1003;
j[1][3]=1004;

j[2][0]=2000;
j[2][1]=2001;
j[2][2]=2002;
j[2][3]=2003;
System.out.println("************************");
System.out.println(j[1][2]);

for(int a=0; a<3; a++) {
	//i=0,1,2,3,4
	//System.out.println("Value of a is ");
	for(int b=0; b<4; b++) {
		//j=0,1,2,3,4
		System.out.println(j[a][b]);
	}
}

	}

}
