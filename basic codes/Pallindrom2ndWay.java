package basicCodes;

import java.util.Scanner;

public class Pallindrom2ndWay {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		int num1 = num;
		int rev = 0;
		
		while(num>0)
		{
			int dig = num%10;
			rev = rev*10+dig;
			num = num/10;
		}
		System.out.println("Reverse Number: "+rev);
		if(num1 == rev)
		{
			System.out.println("Number is Pallindrome");
		}else {
			System.out.println("Number is Not Pallindrome");
		}

	}

}
