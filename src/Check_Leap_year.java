import java.util.Scanner;

public class Check_Leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Leap year is an year having 366 y=days, while the normal year has 365 dys");
		System.out.println("If the year is evenly divisible by 4 and not divisible by 100, then it is leap year");
        System.out.println("if the year is evenly divisible by both 4 and 100, then we  need to check is it divisible by 400, to cinfirm it as leap year");
        
        /* year / 4 = 0
        year/100 != 0 leap year
        
        year/4 = 0
        year/100 = 0
        year/400 != 0 leap year
		*/ 
        
		System.err.println("Java program to check whether the given year is Leap Year");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year");
		int year = scanner.nextInt();
		
		boolean isLeapYear = false;
		
		scanner.close();
		
		
		
	}

}
