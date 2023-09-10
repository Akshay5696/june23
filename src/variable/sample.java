package variable;
// global variables-inside class but not in any method
	//scope-can be used throughout the class
// local methods- inside class also inside loop
	//scope-only inside that block where it is decleared
public class sample {
	static int a=10; //global
	public static void addition() 
	{
		int b=20; //local
		int sum=a+b+z;
		System.out.println(sum);
	}
	public static void multiplication() 
	{
		int c=30; //local
		for(int i=1;i<=5;i++) //local 
		{
			int d=a+i;
		}
		//int multi=a*c*b*i*z;
	}
	static int z=50; //global
	public static void main(String[] args) {
		sample object=new sample();
		object.addition();
		object.multiplication();
	}
}
