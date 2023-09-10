package stringPackage;

public class Split {
	public static void main(String[] args) {
		String s1="aspire training institute pune";
		String[] str = s1.split("i");
		System.out.println(str[0]);
		System.out.println(str[1]);
		
		System.out.println();
		
		String[] sar = s1.split(" ");
		//{aspire,training,institute,pune}
		System.out.println(sar[0]);
		System.out.println(sar[1]);
		System.out.println(sar[2]);
		System.out.println(sar[3]);
		
	}

}
