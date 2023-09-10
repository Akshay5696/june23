package ExceptionHandeling;

public class NestedTry {
	public static void main(String[] args) {
		int a=0;
		int b=20;
		int[] c= {2,0,5,8,1};
		int div=0;
		int sum=0;
		try 
		{
			sum=b+c[5];
			try 
			{
				div=sum/a;
			}
			catch(ArithmeticException ai) 
			{
				System.out.println("dividing by 0");
			}
		}
		catch(ArrayIndexOutOfBoundsException ae) 
		{
			System.out.println("array index overflow");
		}
	}
}
