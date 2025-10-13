package JavaCodesRevise;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the Number to check Pallindrome or Not: ");
		int num = sc.nextInt();
		int num1 = num;
		int rev = 0;
		while(num>0)
		{
			int dig = num%10;
			rev = rev*10+dig;
			num = num/10;
		}
		
		System.out.println(rev);
		
		if(num1 == rev) {
			System.out.println("Number: "+num1+" is Pallindrome");
		}else {
			System.out.println("Number: "+num1+" is not Pallindrome");
		}

	}

}
