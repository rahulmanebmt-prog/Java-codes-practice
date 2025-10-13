package basicCodes;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		boolean flag = true;
		
		if(num<=1)
		{
			flag = false;
		}else {
		for(int i=2; i<num; i++)
		{
			if(num%i == 0)
			{
				flag = false;
				break;
			}
		}
		
		}
		if(flag )
		{
			System.out.println("Number is Prime");
		}else {
			System.out.println("Number is not Prime");
		}
	}

}
