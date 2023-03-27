
public class Third_Java_Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// flow control statement
	System.err.println("FLOW CONTROL STATMENT");
	System.err.println("IF STATEMENT");
	
	int a = 3, b = 4;
	if (a>b)//flase so next output will print // if a is greater than b then 1st output will print
	    {
		System.out.println(" a is greater then b ");
		}
	    System.out.println("End of the program");
	
	        
	  // if else statement  
	System.err.println(" IF ELSE STATEMENT ");  
	
	int c = 3, d = 4;
	if(c>d) {
		 System.out.println("c is less than b" );
	 } else {
		 System.out.println(" hence proved c is less");
	 }
	
	 
	 // IF ELSE IF.. ELSE STATEMENT
	System.err.println("IF ELSE IF... ELSE STATEMENT");
	
	int e = 9, f = 8, g = 6, h = 3, i = 1;
	if (e<f) {
		 System.out.println(" e is less than f flase ");
	 } 
	 else if (f<g) {
		 System.out.println(" f is less than g false ");
	 } 
	 else if (h>i) { 
		 System.out.println("h is greater than i true ");
	 }else {
		 System.out.println("all options are false so this else part will print");
	 }
	 
	 
	 // switch condition case
	 System.err.println(" switch case condition");
	 
	 String fooditem = "pizza";
	 switch(fooditem) {
	 
	 case "burger":
		 System.out.println("Here is your burger");
		 break;
	 case "Pasta" :
		 System.out.println("Here is your pizza");
		 break;
	 case "noodles":
		 System.out.println("Here is your noodles");
		 break;
	 default:
			 System.out.println("We only serve buger, pasta , noodles");		 
	 }
	 
	 
	 // While loop statments
	 System.err.println("While loop statement");
	 
	 int x = 1;
	 while (x<=10) {
		 System.out.println(x); //we don't put i++ then i value will print infinite time
		x++; //x will print 1 to 10
	 }
	 System.out.println("End of the program");
   
	
	// Do While Loop statement
	System.err.println("Do While Loop statement");
	int y=11;
	do {
		System.out.println(y);
		y++;
	} while (y<=10);
	System.out.println("End of the program");

	
	// For loop statement
   System.err.println("For Loop statement");	
    for (int z=2; z<=20; i++) {
    	System.out.println(z);
    }
     
	}
}

