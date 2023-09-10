package LogicalPrograms;
// interchange values of variables with and without changing variables
public class Switch2Numbers {
public static void main(String[] args) {
	int a=10;
	int b=20;
//1. using 3rd variable
//	int temp;
//	temp=a; // temp = 10
//	a=b; // a=20
//	b=temp; // b=10
//	System.out.println(a);
//	System.out.println(b);
	
	//2. without using 3rd variable
	a=a+b; // a=10+20=30
	b=a-b; // b=30-20=10
	a=a-b; //a=30-10=20
	System.out.println(a);
	System.out.println(b);
}
}
