package stringPackage;

public class Sample {
	public static void main(String[] args) {
		String a="Aspire";//stored in constant String pool area
		String b="Aspire";//stored in constant String pool area
		String c=new String("Aspire");//stored in non-constant String pool area
		String d=new String("Aspire");//stored in non-constant String pool area
		//string created by "new" keyword are stored in non-constant string pool area
		//here objects(memory location) are getting compared
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(c==d);
		System.out.println();
		
		System.out.println(a.equals(b));//here content getting compared(i.e Aspire)
		System.out.println(a.equals(c));//here content getting compared(i.e Aspire)
		System.out.println(c.equals(d));//here content getting compared(i.e Aspire)
		
		
		
	}
}
