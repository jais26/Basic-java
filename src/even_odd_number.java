import java.util.Scanner;

public class even_odd_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.err.println("Java program to chck whether given input number is even or odd");
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter any number");
		int num = scanner.nextInt();
		
		scanner.close();
		
		if(num%2==0) {
			System.out.println("Number given by user is an even number");
		} else {
			System.out.println("Number given by user is an odd number");
		}
	}

}
