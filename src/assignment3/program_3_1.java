package assignment3;

import java.util.Scanner;

import conditionalStatements.Switch1;

//create a single class and write 3 methods to fulfill below requirements
public class program_3_1 {
	public static void main(String[] args) {
		program_3_1 p = new program_3_1();
		p.monthIndex();
		
		System.out.print("Enter the dayIndex: ");
	Scanner sc = new Scanner(System.in);
	int dayIndex=sc.nextInt();
	
	switch (dayIndex) {
	case 1:
		System.out.println("Monday/Week Day");
		break;
	case 2:
		System.out.println("Tuesday/Week Day");
		break;
	case 3:
		System.out.println("Wednesday/Week Day");
		break;
	case 4:
		System.out.println("Thursday/Week Day");
		break;
	case 5:
		System.out.println("Friday/Week Day");
		break;
	case 6:
		System.out.println("Satday/Week End");
		break;
	case 7:
		System.out.println("Sunday/Week End");
		break;

	default:
		System.out.println("INVALID INDEX");
		break;
	}
	}
	public void monthIndex() 
	{
		System.out.print("Enter the monthIndex: ");
		Scanner s = new Scanner(System.in);
		int monthindex=s.nextInt();
		
		switch (monthindex) {
		case 1:
			System.out.println("FY2022 Q1");
			break;
		case 2:
			System.out.println("FY2022 Q1");
			break;
		case 3:
			System.out.println("FY2022 Q1");
			break;
		case 4:
			System.out.println("FY2022 Q2");
			break;
		case 5:
			System.out.println("FY2022 Q2");
			break;
		case 6:
			System.out.println("FY2022 Q2");
			break;
		case 7:
			System.out.println("FY2022 Q3");
			break;
		case 8:
			System.out.println("FY2022 Q3");
			break;
		case 9:
			System.out.println("FY2022 Q3");
			break;
		case 10:
			System.out.println("FY2022 Q4");
			break;
		case 11:
			System.out.println("FY2022 Q4");
			break;
		case 12:
			System.out.println("FY2022 Q4");
			break;

		default:
			System.out.println("INVALID");
			break;
		}
	}
}
