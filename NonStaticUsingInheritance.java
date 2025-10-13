package basicCodes.staticPackage;

class Parent{
	void run() {
		System.out.println("Running");
	}
	
	static void sing() {
		System.out.println("Singing");
	}
}

public class NonStaticUsingInheritance extends Parent{

	public static void main(String[] args) {
		
//		run(); 	 we can't call non static method of parent class to child class's static method directly 
				//	we need to create object of child class
		
		sing();

	}
	
	void walk() {
		run();		// we can call non static method of parent class to child class's non static method directly
		
	}

}
