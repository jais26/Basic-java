public class second_Java_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("void is a return type");

		int a = 6 , b = 3 , c = 9 , d = 5;
		
		// ARITHMATIC OPERATORS
		System.out.println("ARITHMATIC OPERATOR");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		
		// incremented operater (post and pree)
		System.out.println("INCREMENT OPERATOR");
		System.out.println( a++ ); // 6 ans
		System.out.println( a );  // 7
		
		System.out.println(++a ); // 8 ans
		System.out.println(a );  // 8
		
		// decremneted operrator (post an pree)
		System.out.println("DECREMENT OPERATOR");
		System.out.println( a-- ); //8 
		System.out.println( a );   // 7
		
		System.out.println( --a ); // 6
        System.out.println( a );  // 6
        
        // Relational operators
        System.out.println("RELATIONAL OPERATORS");
        System.out.println(a==b); // equals
        
        System.out.println(a!=c); //not equal
        
        System.out.println(a>d); // greater then
        
        System.out.println(b<c); //leass than
        
        System.out.println(b>=d); //greater then equal to
        
        System.out.println(b<=d); //less then equal to
        
        System.out.println(c==d);
        System.out.println(a==a);
        System.out.println(b==b);
        
        //logical  AND operater
        System.out.println("AND OPERATOR");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        
        // OR operator
        System.out.println("OR OPERATOR");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        
        // NOT operator
        System.out.println("NOT OPERATOR");
        System.out.println(!true);
        System.out.println(!false);
        
         // Assignment operator
         System.out.println("ASSIGNMENT OPERATOR");
         a+= 4;  //a = a + 4;
         a-= 4;  //a = a - 4;
         a*= 4;  //a= a * 4;
         a/= 4;  // a = a / 4; 
         a%= 4;  // a = a % 4;
         System.out.println(a);  // a=6 so 6+4=10
         
         // OTHER operator
         System.out.println("OTHER OPERATOR");
        String J =  (a>b) ? "jyoti" : "sharma";
        String J1 = (a<b) ? "jyoti" : "sharma";
        System.out.println("J");
        
        // Literals
        System.out.println("literals are constant value which are assigned in variable");
		
	}

}
