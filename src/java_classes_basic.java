import java.util.Scanner;

public class java_classes_basic {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// program to calculate
		System.err.println("Program to calculate based on priority");
		System.out.println(9+6-3*4/2%5);  // * / % + - priorities based calculations
		
		// program to enter value from user
		System.err.println("Java program for intaking two numbers using scanner and printing their sum ");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int firstnumber = scanner.nextInt();
		
		System.out.println("Enter second number");
		int secondnumber = scanner.nextInt();
		
		scanner.close();
		
		System.out.println("The sum of "+firstnumber+" and "+secondnumber+" is: "+(firstnumber+secondnumber));
		 
	    // practice
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter your first name");
//		firstname = scanner.toString();
//		
//		System.out.println("Enter your last name");
//		String lastname = scanner.toString();
//		
//		System.out.println("Your "+firstname+" and "+lastname+" is:- "+(firstname+lastname));
			
	}

}
