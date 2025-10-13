package basicCodes.staticPackage;

public class OuterClass {
	static int a = 100;
	int b = 200;
	static void walk() {
		System.out.println("Walking");
	}
	
	void sing() {
		System.out.println("Singing");
	}
	
	public static class InnerClass{
		void run()
		{
			System.out.println("Running");
			System.out.println(a);	//  we can call static variable in static class
		//	System.out.println(b); // we can't call non static variable in static class
		//	sing();					// we can't call non static method in static class
			walk();					//  we can call static method in static class
		}
		
		
	}

	public static void main(String[] args) {
		
		OuterClass.InnerClass inner = new OuterClass.InnerClass();
		inner.run();
		
	}

}
