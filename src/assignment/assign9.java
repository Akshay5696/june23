package assignment;
/* Find sum of all numbers in user defined range
  input range-> 1 to 5
 */
public class assign9 {
public static void main(String[] args) {
	int min=1;
	int max=5;
	int sum=0;
	sumNumbers(min,max);
}
public static void sumNumbers(int i, int j) {
	int sum=0;
	for (int k=i; k<=j; k++) {
		sum=sum+k;
		
	}
	System.out.println("the sum is " + sum);
}
}
