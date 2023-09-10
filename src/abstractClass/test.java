package abstractClass;

public class test {
	public static void main(String[] args) {
		
	//parent p = new parent(); 
	//cant create obj bcoz memory cant allocate to the abstract method
	
	//child1 c1 = new child1();
	//cant create obj bcoz memory cant allocate to the abstract method
	
	grandChild gc = new grandChild();
	//create obj bcoz memory allocate to the complete method
	gc.method3();
	gc.method1();
	gc.method2();
	gc.method4();
	gc.method5();
	gc.method6();
	
	child2 c2 = new child2();
	//create obj bcoz memory allocate to the complete method
	c2.method2();
	c2.method3();
	c2.method4();
	c2.method5();
	c2.method6();
	}
	}
