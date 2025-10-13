package basicCodes.staticPackage;

public class StaticVariableAndInstanceVariable {
	
	static int a = 100;	// static global variable
	int b = 200;		// non static variable or instance variable
	static int c ;
	public static void main(String[] args) {
		
		int d;	
		
		System.out.println(a);	// we can access static variable directly
	//	System.out.println(b);	// we can't access non-static variable directly
								//	we need to create object of class
		
		StaticVariableAndInstanceVariable st = new StaticVariableAndInstanceVariable();
		st.run();
		System.out.println(st.b);	// we can call instance variable by creating object.
		int a = 300;				// local variable has more priority that static variable
		System.out.println(a); 	
		System.out.println("Default value of static variable: "+c); // we can call static variable without initializing any value to it
																	// It will provide us default value
	//	System.out.println(d);	--> local variable does not have any default value we need to initialize it before using it
		d = 500;
		System.out.println(d); 		// we can call it after initialization
		
	}
	void run() {
		System.out.println(b);	// we can call it in non static method
	}

}
