package returnType;

public class ReturnTypeInJava {
	public void test1() //void can't return anything 
	{
		
	}
	public int test2() 
	{
		return 3;
	}
	public double test3() 
	{
		return 3.60;
	}
	public boolean test4() 
	{
		return true;
	}
	public char test5() 
	{
		return 'a';
	}
	public String test6() 
	{
		return "Three";
	}
	public ReturnTypeInJava test7() 
	{
		return new ReturnTypeInJava();
	}
	public int[] test8() 
	{
		return new int[7];
	}
	public static void main(String[] args) {
		ReturnTypeInJava r=new ReturnTypeInJava();
		int a=r.test2();
		System.out.println("test2- " + a);
		
		double b=r.test3();
		System.out.println("test3 - " + b);
		
		boolean c=r.test4();
		System.out.println("test4 - " + c);
		
		char d=r.test5();
		System.out.println("test5 - " + d);
		
		String e=r.test6();
		System.out.println("test6 - " + e);
		
		int f[]=new int [5];
		System.out.println(f);
	}
}
