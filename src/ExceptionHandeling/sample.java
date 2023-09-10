package ExceptionHandeling;

public class sample {
	public static void main(String[] args) {
		int a=0;
		int b=20;
		int div=0;
		try 
		{
		div=b/a; //risky code
		}
		catch(ArithmeticException e)
		{
			//alternate code
			System.out.println("do not devide by 0"); //comment
		}
		System.out.println(b);
		System.out.println(div);
	}
}
