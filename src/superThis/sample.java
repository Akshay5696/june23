package superThis;

public class sample {
	int a;
	int b;
	public void setValues(int a, int b) 
	{
		this.a=a; // global a=local a
		this.b=b; // global b=local b
	}
	public static void main(String[] args) {
		sample sa=new sample();
		sa.setValues(10,20);
		System.out.println(sa.a);
		System.out.println(sa.b);
	}
}
