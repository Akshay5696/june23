package assignment5;

public class program5_1 {
	public static void main(String[] args) {
		program5_1 num = new program5_1();
		num.primeNumbers(10, 15);
		num.divisibleBy5(10, 30);
		num.divBy5And3(5, 18);
		num.divBy7Or13(5, 40);
		num.sum(1, 5);
		num.oddEven(3, 9);
		num.reverseOdd(10, 20);
		
	}
	
	public void primeNumbers(int a,int b) 
	{
		System.out.println("---PRIME NUMBERS---");
		for(int i=a; i<=b; i++) 
		{
			if(i%2==0) 
			{
				System.out.println(i);
			}
		}
	}
	
	public void divisibleBy5(int a,int b) 
	{
		System.out.println("---DIVISIBLE BY 5---");
		for (int i=a; i<=b; i++) 
		{
			if(i%5==0) 
			{
				System.out.println(i);
			}
		}
	}
	
	public void divBy5And3(int a,int b) 
	{
		System.out.println("---DIVISIBLE BY 5 AND 3---");
		for(int i=a; i<=b; i++) 
		{
			if(i%5==0 && i%3==0) 
			{
				System.out.println(i);
			}
		}
	}
	
	public void divBy7Or13(int a,int b) 
	{
		System.out.println("---DIVISIBLE BY 7 OR 13---");
		for(int i=a; i<=b; i++) 
		{
			if(i%7==0)
			{
				System.out.println(i + " Divisible By 7");
			}
			else if(i%13==0) 
			{
				System.out.println(i + " Divisible by 13");
			}
		}
	}
	
	public void sum(int a,int b) 
	{
		System.out.println("---SUM OF ALL NUMBERS---");
		int add=0;
		for(int i=a; i<=b; i++) 
		{
			add=add+i;
		}
		System.out.println(add);
	}
	
	public void oddEven(int a,int b) 
	{
		System.out.println("---DIFF B/W SUM OF ODD NUMBERS AND EVEN NUMBERS---");
		int sumEven=0;
		int sumOdd=0;
		for(int i=a; i<=b; i++) 
		{
			if(i%2==0) 
			{
				sumEven=sumEven+i;
			}
			else
			{
				sumOdd=sumOdd+i;
			}
		}
		System.out.println(sumOdd-sumEven);
	}
	
	public void reverseOdd(int a,int b) 
	{
		System.out.println("---ODD NUMBERS IN REVERSE ORDER---");
		for(int i=b; i>=a; i--) 
		{
			if(i%2!=0) 
			{
				System.out.println(i);
			}
		}
	}
}
