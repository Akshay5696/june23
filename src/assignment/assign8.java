package assignment;
/* on user defined range print all numbers which are divisible by 7 or divisible by 13
hint- pass start and end index as aparameter
input -> range 5 to 40
*/
public class assign8 {
public static void main(String[] args) {
	int min=5;
	int max=40;
	System.out.println("Divisible by 7 or 13, numbers are");
	numberDivisibleBy7Or13(min,max);
}
public static void numberDivisibleBy7Or13(int i,int j) {
	for (int k=i; k<=j; k++) {
		if (k%7==0) {
			System.out.println(k + " is divisible by 7");
		}
		else if (k%13==0) {
			System.out.println(k + " is divisible by 13");
		}
	}
}
}
