package basicCodes;

public class MainDifferentWaysToCreateMainMethod {

	//This one is used by all
	public static void main(String[] args) {
			System.out.println("main() method 1st way");
	}
	
/*	but there are multiple ways to create main method but we can't change method name i.e. main then 
	we can't change access modifier and method should be static	*/
	
//	Different ways to create main()
	//1st we can use array with args also
/*	public static void main(String args[]) {
		System.out.println("main() method 2nd way");
	}*/
	
	
	// 2nd we can change arguments name i.e. we can change args to anything
//	public static void main(String ar[]) {
//		System.out.println("main() method 3rd way");
//	}
	
	// 3rd we can use String... args
//	public static void main(String... args) {
//		System.out.println("main() method 4th way");
//	}
//	

}
