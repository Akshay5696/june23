package question;
//import java.util.Scanner;
public class stringName {
	public static void main(String[] args) {
		String name="akshay";
//		Scanner sc = new Scanner(System.in);
//		String name = sc.nextLine();
		String even="";
		String odd="";
		for(int i=0;i<name.length();i++) 
		{
			if(i%2==0) 
			{
				even=even + name.charAt(i);
			}
			else 
			{
				odd=odd + name.charAt(i);
			}
		}
		System.out.println(even);
		System.out.println(odd);
	}
}
