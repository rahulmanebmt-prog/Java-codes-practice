package staticAndPrivateOverride;

/* we cant override private method, because private method cant be access outside of the class.
 * And suppose we are creating method in child class same as parent class method with same name
 * and formal arguments then it's actually a new method not overriden method
 */

class Private{
	private void run() {
		System.out.println("Run");
	}
}

public class PrivateOverride extends Private{

	public static void main(String[] args) {
	
		PrivateOverride po = new PrivateOverride();
		po.run();

	}
	
//	@Override
	private void run() {
		System.out.println("Walk");
	}

	
}
