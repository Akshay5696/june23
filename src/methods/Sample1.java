package methods;

import methodDiffPackage.Sample3;

public class Sample1 {
	static int a=10;
	static int b=20;
	public static void main(String[] args) {
	System.out.println("Main Method - Hi");
	staticRegularMethod();
	addition();
	multiplication();
	addition();
	subtraction();
	multiplication();
	Sample2.staticRegularMethodFromDifferentClass();//take from Sample2 class
	Sample3.staticRegularMethodDifferentFromPackage();//take from methodDiffPackage
}
public static void staticRegularMethod() {
	System.out.println("Regular Method - Hi");
}
public static void addition() {
	int sum=a+b;
	System.out.println("addition of a & b is " + sum);
}
public static void subtraction() {
	int sub=a-b;
	System.out.println("subtraction of a & b is " + sub);
}
public static void multiplication() {
	int multi=a*b;
	System.out.println("multiplication of a & b is " + multi);
}
}
