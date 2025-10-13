package basicCodes;

public class PrimeNumberSet {
	
	
	public static void main(String []args) {
		
		
		
		String str = "My name is Akshay, How are you?";  // How are you? My name is Akshay
		
		String[] str1 = str.split(",");
		for(int i=str1.length-1; i>=0; i--)
		{
			System.out.print(str1[i]+" ");
		}
		
		
	}

}
