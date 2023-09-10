package stringPackage;

public class FunctionsOfString2 {
	public static void main(String[] args) {
		String s1="aspire";
		String s2="Aspire";
		String s3="aspire pune";
		String s4="";
		
		System.out.println(s3.contains(s1)); //contain shows initial,middle,end or inbetween anything
		System.out.println(s3.contains(s2));
		System.out.println(s3.contains(s2.toLowerCase()));
		System.out.println(s3.contains("p"));
		System.out.println(s3.contains("P")); //case sensitive
		System.out.println();
		
		System.out.println(s3.isEmpty()); //checks empty string
		System.out.println(s4.isEmpty());
		System.out.println();
		
		System.out.println(s3.charAt(3)); //represent character at of index no.
		System.out.println(s3.charAt(7));
		System.out.println(s3.charAt(0));
		System.out.println(s3.charAt(s3.length()-1)); //for last character
		System.out.println();
		
		System.out.println(s3.startsWith("a")); //verifies string starts with
		System.out.println(s3.startsWith("p"));
		System.out.println(s3.startsWith(s1));
		System.out.println(s3.startsWith(s2));
		System.out.println(s3.startsWith("aspire"));
		System.out.println();
		
		System.out.println(s3.endsWith("e")); //verifies string ends with
		System.out.println(s3.endsWith("a"));
		System.out.println(s3.endsWith(s2));
		System.out.println(s3.endsWith("pune"));
		System.out.println();
		
		System.out.println(s3.indexOf('a')); //represent index of character
		System.out.println(s3.indexOf('i'));
		System.out.println(s3.indexOf('p')); //checks from left to right & prints only 1st commer
		System.out.println();
		
		System.out.println(s3.lastIndexOf('e')); //represent index of character
		System.out.println(s3.lastIndexOf('p')); //checks from right to left
		System.out.println(s3.lastIndexOf('a')); // but prints original index no.
		System.out.println();
		
		System.out.println("---substring---");
		System.out.println(s3.substring(3)); //printing start from i/p index no.(includes) to last index
		System.out.println(s3.substring(4, 8));
		//starting i/p index no.includes but ending i/p index no. excludes
		// contains--> only check(boolean o/p)
		// substring--> print o/p
		System.out.println();
		
		System.out.println(s1.concat(s2)); //concat means merging two strings
		System.out.println(s1.concat(s2).concat(s3));
		String s5=s1+s2+s3; //by this way we can also concat
		System.out.println(s5);
		System.out.println();
		
		System.out.println(s3.replace('a', 'A'));
		System.out.println(s3.replace('p', 'P'));
		System.out.println(s3.replace("aspire", "ASPIRE"));
		System.out.println(s3.replace("aspire", s2));
	}
}
