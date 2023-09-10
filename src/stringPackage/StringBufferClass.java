package stringPackage;

public class StringBufferClass {
	public static void main(String[] args) {
		StringBuffer sbf=new StringBuffer();
		System.out.println(sbf.capacity());
		sbf.append("Aspire ");
		System.out.println(sbf);
		
		System.out.println(sbf.capacity());
		sbf.append("training ");
		sbf.append("institute ");
		sbf.append("pune");
		System.out.println(sbf);
		System.out.println(sbf.capacity());
		
		sbf.ensureCapacity(70);
		System.out.println(sbf.capacity());
		
		System.out.println(sbf.insert(2,"Pune"));
		
		sbf.delete(11, 20);
		System.out.println(sbf);
		
		sbf.reverse();
		System.out.println(sbf);
	}
}
