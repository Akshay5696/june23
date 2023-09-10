package oops.Hirarchicalinheritance;

public class test {
public static void main(String[] args) {
	parent p=new parent();
	p.bunglow();
	p.car();
	child1 c1=new child1();
	c1.smartphone();
	c1.bike();
	c1.bunglow();
	c1.car();
	child2 c2=new child2();
	c2.smartphone();
	c2.bicycle();
	c2.bunglow();
	c2.car();
	child3 c3=new child3();
	c3.smartphone();
	c3.scooter();
	c3.bunglow();
	c3.car();
	
}
}
