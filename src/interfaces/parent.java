package interfaces;

public interface parent {
	public void calling();
	public void sms();
	public void internet();
	
	//we can also define static method,static dosent require constructor
	// hence static method is possible in interface
	
	public static void method1() 
	{
		System.out.println("static method in interface");
	}
}
