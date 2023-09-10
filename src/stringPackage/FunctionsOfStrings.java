package stringPackage;

public class FunctionsOfStrings {
	public static void main(String[] args) {
		String s1="Aspire Pune";
		String s2="aspire";
		String s3="ASPIRE";
		
//		System.out.println(s1.toUpperCase());
//		System.out.println(s2.toUpperCase());
//		System.out.println(s3.toUpperCase());
//		System.out.println();
//		
//		System.out.println(s1.toLowerCase());
//		System.out.println(s2.toLowerCase());
//		System.out.println(s3.toLowerCase());
//		System.out.println();
//		
//		System.out.println(s1.length());
//		System.out.println(s1.length()-1);
//		System.out.println();
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println();
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println();
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println();
	}
}
