package constructor;

public class Sample {
int a; // non static data members(variable and method) value assign
boolean b;
char c;
float d;
short e;
String s;
public static void main(String[] args) {
	Sample object=new Sample();
	// ClassName objectname = new ConstructorName();
	// ConstructorName should be same as class name
	object.method();
}
public void method() {
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(s);
}
}
