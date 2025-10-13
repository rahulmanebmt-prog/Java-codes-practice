package staticAndPrivateOverride;

/* static method can't be override if we create same method in child class
with same name and same formal arguments then it is method hidding not method overloading

*/

class Parent{
	public static void run() {
		System.out.println("Running");
	}
}

public class StaticOverRide extends Parent{

	public static void main(String[] args) {
		run();

	}
	
//	@Override
	public static void run() {
		System.out.println("Walk");
	}

}
