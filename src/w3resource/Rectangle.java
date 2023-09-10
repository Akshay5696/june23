package w3resource;
// child class rectangle
public class Rectangle extends Shape {
	private double length;
	private double width;
	
	public Rectangle(double length, double width) 
	{
		this.length=length;
		this.width=width;
	}
	public double getArea() 
	{
		return length*width;
	}
	
	//main class
	public static void main(String[] args) {
		Rectangle rct = new Rectangle(3.0, 10.0);
		double area = rct.getArea();
		System.out.println("The area of rectangle is: " + area);
	}
}
