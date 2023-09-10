package oops.inheritance;

public class test {
public static void main(String[] args) {
	parent p=new parent();
	p.bunglow();
	p.car();
	child c=new child();
	c.bike();
	c.bunglow();
	c.car();
	c.addition();
	GrandChild gc=new GrandChild();
	gc.doll();
	gc.bike();
	gc.bunglow();
	gc.car();
}
}
