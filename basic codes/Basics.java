package basicCodes;

public class Basics {
	public static void main(String[] args) {
		int a ; // Declaration 
		a = 10;	// Initialization
		System.out.println(a); // Utilization
		
		
		a=016;   //   It is octal Number as it starts with "0"  016 in octal = 0*8^2 + 1*8^1 + 6*8^0
				//															 =  0	 +	8	 +	6    = 14
		System.out.println(a);	// 14
		
		System.out.println((a>0?"Positive":"Negative")); // ternary operator
		
		
	}

}
