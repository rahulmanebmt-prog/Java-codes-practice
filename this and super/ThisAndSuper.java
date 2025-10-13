package basicCodes.thisAndSuperKeyword;

class Parent{
	void run() {
		System.out.println("Calling run of Parent");
		//System.out.println("Running");
	}
	static void walk() {
		System.out.println("Calling walk of Parent");
		//System.out.println("Walking");
	}
}

public class ThisAndSuper extends Parent{

	public static void main(String[] args) {
		
		ThisAndSuper ts = new ThisAndSuper();
		ts.sing();
		eat();
		ts.play();
		ts.callToParentMethods();
		System.out.println("Calling walk of parent from main method: ");
		walk();
		
	}
	
	void sing() {
		System.out.println("Singing");
	}
	
	static void eat() {
		System.out.println("Eating");
	}
	
	void play() {
		System.out.println("Calling from play: ");
		this.eat(); // we can call static and non static member using this here we called static method
		this.sing(); 	// here we called non-static method
	}
	
	void callToParentMethods() {
		System.out.println("Calling from callToParentMethods: ");
		super.run();
		super.walk();
		
	}

}
