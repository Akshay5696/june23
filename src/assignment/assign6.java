package assignment;
/* on user defined range print all numbers which are divisible by 5
 hint- pass start and end index as aparameter
 input -> range 15 to 30
 */
public class assign6 {
public static void main(String[] args) {
	int min=10;
	int max=30;
	System.out.println("Numbers divisible by 5 from 15 to 30 are ");
	numberDivisibleBy5(min,max);
}
public static void numberDivisibleBy5(int i,int j) {
	for(int k=i; k<=j; k++) {
		if (k%5==0) {
			System.out.println(k);
		}
	}
}
}
