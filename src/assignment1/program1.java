package assignment1;
//calculator program using parameterized method
public class program1 {
	public static void main(String[] args) {
		addition(2,4);
		substraction(2,4);
		multiplication(2,4);
		division(2,4);
		reminder(2,4);
		
	}
	public static void addition(int a,int b) 
	{
		int sum=a+b;
		System.out.println("The Addition is= "+sum);
	}
	public static void substraction(int a,int b) 
	{
		int sub=a-b;
		System.out.println("The Substraction is= "+sub);
	}
	public static void multiplication(int a,int b) 
	{
		int multi=a*b;
		System.out.println("The Multiplication is= "+multi);
	}
	public static void division(int a,int b) 
	{
		int div=a/b;
		System.out.println("The Divison is= "+div);
	}
	public static void reminder(int a,int b) 
	{
		int rem=a%b;
		System.out.println("The Reminder is= "+rem);
	}
}
