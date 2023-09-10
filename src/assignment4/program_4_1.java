package assignment4;

public class program_4_1 {
	public static void main(String[] args) {
		program_4_1 obj = new program_4_1();
		obj.processResult(49);
	}
	public void processResult(int n) 
	{
	if(n>=0 && n<=100) 
	{
		if(n>=0 && n<=49) 
		{
			System.out.println("Failed obatined marks is 36,WORK HARDER");
		}
		if(n>=50 && n<=100) 
		{
			System.out.println("Student could clear exam");
		}
		if(n>=90 && n<=100) 
		{
			System.out.println("A+ very good job");
		}
		if(n>80 && n<=89) 
		{
			System.out.println("A, good job");
		}
		if(n>=70 && n<=79) 
		{
			System.out.println("B+,you are improving");
		}
		if(n>60 && n<=69) 
		{
			System.out.println("C+,keep reading");
		}
		if(n>50 && n<=59) 
		{
			System.out.println("C,you can do it better");
		}
	}
	else 
	{
		System.out.println("invalid");
	}
	
}
	
	
	
	
	
}