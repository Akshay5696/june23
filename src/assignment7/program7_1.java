package assignment7;

public class program7_1 {
	public static void main(String[] args) {
		program7_1 num = new program7_1();
		num.division(10, 200);
	}
	
	public void division(int a,int b) 
	{
		for(int i=a; i<=b; i++) 
		{
			if(i%3==0 && i%7==0) 
			{
				if(i>=147) 
				{
				System.out.println(i);
				}
			}
		}
		
	}
}
