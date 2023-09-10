package casting;
// casting is converting one type of data into another type of data
// boolean casting is not possible coz it is incompatible
public class primitiveCasting {
	public void implicit() 
	{
		byte a=10;
		short b=20;
		int sum=a+b;
		System.out.println(sum);
		
		int c=a;
		float d=c;
		System.out.println(d);
	}
	
	public void explicit() 
	{
		int i=1281255;
		short j=(short)i;
		System.out.println(j);
		
		float p=125.78f;
		int q=(int)p;
		System.out.println(q);
	}
	public static void main(String[] args) {
		primitiveCasting pc = new primitiveCasting();
		pc.implicit();
		System.out.print("\n");
		pc.explicit();
	}
}
