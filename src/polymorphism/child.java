package polymorphism;

public class child extends parent {
	public void multiplication(int a) 
	{
		int b=200;
		int multi=a*b;
		System.out.println(multi);
	}
	public static void main(String[] args) {
		child c=new child();
		c.multiplication(); //from parents class
		c.multiplication(100); //from child class
	}
}
