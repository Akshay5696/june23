package conditionalStatements;
// month of year by number
// 1-Jan
//2-Feb
//3-Mar
//12-Dec
public class Switch1 {
public static void main(String[] args) {
	int month =2; //if we wrong input or input which is not exist then it take to the default statement
	switch (month) {
	case 1:
		System.out.println("Jan");
		break;
	case 2:
		System.out.println("Feb");
		break;
	case 3:
		System.out.println("Mar");
		break;
	case 4:
		System.out.println("Apr");
		break;
	case 12:
		System.out.println("Dec");
		break;
	default:
		System.out.println("wrong entry");
		break;
	}
}
}
