package assignment;
/* on user defined range print all numbers which are divisible by 5 and divisible by 3
 hint- pass start and end index as aparameter
 input -> range 5 to 18
 */
public class assign7 {
public static void main(String[] args) {
	int min=5;
	int max=18;
	System.out.println("Numbers divisible by 5 from 5 to 18 are ");
	numberDivisibleBy5(min,max);
}
public static void numberDivisibleBy5(int i,int j) {
	for(int k=i; k<=j; k++) {
		if (k%5==0 && k%3==0) {
			System.out.println(k);
		}
	}
}
}
