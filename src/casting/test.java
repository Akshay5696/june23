package casting;
// non-primitive casting
public class test {
	
	 public static void main(String[] args) {
		parent p = new parent();
		p.bunglow();	//p&c-->p
		p.farm();		//p-->
		System.out.println(p.a);	//p-->p
		
		child c = new child();
		c.bunglow();	//p&c-->c
		c.farm();		//p-->p
		c.car();		//c-->c
		System.out.println(c.a);	//c-->c
		
		parent pc = new child();
		pc.bunglow();	//p&c-->c (o/p will be latest one)
		pc.farm();		//p-->p
		//pc.car();		// we can only those methdos which common in both classes
		System.out.println(pc.a);	//p-->
	}
}
