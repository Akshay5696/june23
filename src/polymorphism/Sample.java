package polymorphism;
// compile time polymorphism (Applicatble for both static & non-static)
public class Sample {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		Sample object = new Sample();
		object.addition(a);
		object.addition(a,b);
		object.addition(a,b);
		object.addition(a,b,c);
		object.addition(100,200,300);
	}
	public void addition(int a) //1 variable
	{
		System.out.println(a);
	}
	public void addition(int a,int b) // 2 variable addition 
	{
		int sum=a+b;
		System.out.println(sum);
	}
	public void addition(int a,long b) // changing the datatype
	{
		long sum=a+b;
		System.out.println(sum);
	}
	public void addition(int a,int b,int c) // 3 variable addition
	{
		int sum=a+b+c;
		System.out.print("\n" +sum);
	}
	/* How to overload a method?
	 1) By changing no. of argument or parameter
	 2) By changing the datatype of parameter
	 3) By changing the sequence of parameter
	 4) for overload it does not matter-->
	 	accessModifier,static/non static,return type
	 5) for overload only matters name and parameters
	 */
}
