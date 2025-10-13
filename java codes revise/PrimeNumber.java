package JavaCodesRevise;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range to check Prime Number: ");
		int num = sc.nextInt();
		if(isPrimeNum(num)) {
			System.out.println("Num: "+num+" is prime Number");
		}else {
			System.out.println("Num: "+num+" is not prime Number");		}

	}

	private static boolean isPrimeNum(int num) {
		if(num<=1)
		{
			return false;
		}
		for(int i=2; i<num;++i) {
			if(num%i == 0)
			{
				return false;
			}
		}
		return true;
	}

}
