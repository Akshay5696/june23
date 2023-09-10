package polymorphism.methodOverriding;

public class test {
	public static void main(String[] args) {
		child c = new child();
		c.bunglow(); // p&c  child bunglow(ALWAYS EXECUTE LATEST CODE)
		c.farm();	 // p    parent farm
		c.car();	 // c	 child car
		child.jwellary(); 
		//memory allocation fixed in static hence cant override
		//hence polymorphism will not happens
		// polymorphism cant execute with private,static and final keywords
		parent.jwellary();
	}
	/* method name,parameter,returntype names,method decleration 
	 should be exactly same in parent and child class
	 */
}
