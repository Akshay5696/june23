package superThis;

public class child extends parent {
	int a=100; //same class global variable--> this.variable
	int b=200;
	public void addition() 
	{
		int a=1000; 
		int b=2000;
		int sum=a+b;
		System.out.println(sum); //30?300?3000?
		int sum1=a+this.a; //1100
		System.out.println(sum1);
		int sum2=a+this.a+super.a; //super.a --> represent global variable of parent class
		System.out.println(sum2); //1110
	}
	public static void main(String[] args) {
		child c=new child();
		c.addition();
	}
}
