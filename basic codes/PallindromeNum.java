package basicCodes;

import java.util.Scanner;

public class PallindromeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		String num1 = String.valueOf(num); // String.valueOf(num); it will convert integer to String
		String[] num2 = num1.split("");
		String num3 = "";
		for(int i=num2.length-1; i>=0; i--)
		{
			 num3 = num3+num2[i];
		}
		
		System.out.println(num3);
		
		int num4 = Integer.parseInt(num3);	//Integer.parseInt(num3) ->  it will convert String Value to Integer
		
		if(num == num4)
		{
			System.out.println("Number is Pallindrome");
		}else {
			{
				System.out.println("Number is Not Pallindrome");
			}
		}

	}

}
