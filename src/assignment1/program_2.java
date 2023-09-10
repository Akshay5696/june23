package assignment1;

import java.util.Scanner;

//print number of days in a given month using switch statement
public class program_2 {
	public static void main(String[] args) {
		System.out.println("Enter The Number Of Month");
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		
		switch (month) {
		case 1:
			System.out.println("Jan = 31");
			break;
		case 2:
			System.out.println("Feb = 28");
			break;
		case 3:
			System.out.println("Mar = 31");
			break;
		case 4:
			System.out.println("Apr = 30");
			break;
		case 5:
			System.out.println("May = 31");
			break;
		case 6:
			System.out.println("Jun = 30");
			break;
		case 7:
			System.out.println("Jul = 31");
			break;
		case 8:
			System.out.println("Aug = 31");
			break;
		case 9:
			System.out.println("Sep = 31");
			break;
		case 10:
			System.out.println("Oct = 31");
			break;
		case 11:
			System.out.println("Nov = 30");
			break;
		case 12:
			System.out.println("Dec = 31");
			break;
		
		default:
			break;
		}
		
	}
}
