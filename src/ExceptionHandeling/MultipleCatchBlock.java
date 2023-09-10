package ExceptionHandeling;
// multiple catch blocks can follow single try block
// but executes only 1 catch block
public class MultipleCatchBlock {
	public static void main(String[] args) {
		int[] a= {1,85,74,0,2,5,8,5};
		int b=20;
		int div=0;
		try
		{
		div=b/a[15];
		}
		catch(ArithmeticException e)
		{
			System.out.println("dividing num with zero");
		}
		catch(ArrayIndexOutOfBoundsException f)
		{
			System.out.println("Array index count is overflow");
		}
		catch(StringIndexOutOfBoundsException g) 
		{
			
		}
		catch(Exception h) //Last catch block - parent exception 
		{
			
		}
		finally //optional block,not mandatory&definitely executes&always exist in last position
		{
			System.out.println("Running from finally block");
		}
		System.out.println(div);
	}
}
