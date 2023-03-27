import java.util.Scanner;

public class Multiplication_table_givenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.err.println("Java program to print multiplications of given input numbers");
		
		Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter number of your choice");
		 int n = scanner.nextInt();
		 scanner.close();
		 
		 for(int i=1 ; i<10 ; i++ ) {
			 System.out.println(n+"x"+i+"="+(n*i));
		 }
	
	}

}
