package methods;

public class parametrizMethod {
public static void main(String[] args) {
	int a=10;
	int b=20;
	addition(a,b); //      i=a=10   j=b=20
	addition(2,3); //      i=2      j=3
	multiplication(a,b); //p=a=10   q=b=20
	multiplication(2,3); //p=2      q=3
	addition(4,5,6); //    i=4  j=5 k=6
	int c=add(4,5);
	System.out.println("the add is:" + c);
	multiplication(c,a);
}
public static void addition(int i,int j) { //i=a=10  j=b=20
	int sum=i+j;
	System.out.println("the addition is: " + sum);
}
public static void multiplication(int p,int q) {
	int multi=p*q;
	System.out.println("the multiplication is:" + multi);
}
public static void addition(int i,int j,int k) {
	int sum=i+j+k;
	System.out.println("the addition is:" + sum);
}
public static int add(int i,int j) {
	int sum=i+j;
	return sum;
}
}
