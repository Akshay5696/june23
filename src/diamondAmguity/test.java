package diamondAmguity;

public class test {
public static void main(String[] args) {
	parent p=new parent();//classname objectName=new classname();
	p.bunglow();
	p.farm();
	
	child1 c1=new child1();
	c1.car();
	c1.flat();
	c1.bunglow();
	
	child2 c2=new child2();
	c2.bike();
	c2.rowhouse();
	c2.farm();
	
	grandchild gc=new grandchild();
	gc.restaurant();
	gc.sportsbike();
//	gc.car();
	gc.bike();
}
}
