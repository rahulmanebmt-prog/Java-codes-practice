package basicCodes;

import java.util.Scanner;

public class PallindromeNumByConvertingToStr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		
		System.out.println(num);
		
		String str = String.valueOf(num);
		String[] str1 = str.split("");
		String s3 = "";
		
		for(int i=str1.length-1; i>=0; i--)
		{
			s3 = s3 + str1[i];
		}
		System.out.println(s3);
		
		Integer.parseInt(s3);
		System.out.println(s3);
	}

}
