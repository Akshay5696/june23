package abstractClass;
//child1 & child2 has same methods declearation but diiferent method defination
abstract public class child1 extends parent {
	// method1 is not here bcoz its already complete method
	public void method2() 
	{
		System.out.println("child1 method2");
	}
	// we removed method 3 to extract in grandchild method
	public void method4() 
	{
		System.out.println("child1 method4");
	}
	public void method5() 
	{
		System.out.println("child1 method5");
	}
	public void method6() 
	{
		System.out.println("child1 method6");
	}
}
