package basicCodes;

import java.util.Scanner;

public class PrimeUsingMeth {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		
		if(isPrime(num))
		{
			System.out.println("Number: "+num+" is Prime Number");
		}
		else {
			System.out.println("Number: "+num+" is 'Not Prime' Number");
		}
	}
	
	static boolean isPrime(int num)
	{
		if(num<=1)
		return false;
		for(int i=2; i<num;i++)
		{
			if(num%i == 0)
			return false;
		}
		return true;
	}
}
