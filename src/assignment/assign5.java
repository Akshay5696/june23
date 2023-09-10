package assignment;
/* on user defined range(parameterized method) print all even numbers
  hint- pass start and end index as a parameter
  input range-> 10 to 15
 */
public class assign5 {
public static void main(String[] args) {
	int min=10;
	int max=15;
	System.out.println("Even numbers from 10 to 15 are ");
	evenNumbers(min,max);
}
public static void evenNumbers(int a,int b) {
	for (int c=a; c<=15; c++) {
		if (c%2==0) {
			System.out.println(c);
		}
	}
}
}
