package assignment2;

public class program_2_2 {
	public static void main(String[] args) {
		String a="Akshay";
		String b="Mayur";
		System.out.println("Before Swap");
		System.out.println("a="+a);
		System.out.println("b="+b);
		int i=a.length();
		a=a+b;
		b=a.substring(0,i);
		a=a.substring(i);
		System.out.println("After Swap");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
