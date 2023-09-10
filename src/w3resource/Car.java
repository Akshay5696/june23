package w3resource;

public class Car extends Vehical{
	public void drive() 
	{
		System.out.println("Repairing a car");
	}
	public static void main(String[] args) {
		Vehical vhcl=new Vehical();
		vhcl.drive();
		
		Car cr=new Car();
		cr.drive();
	}
}
