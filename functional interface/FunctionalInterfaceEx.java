package functionalInterface;

interface Multiply{
	void mul(int a, int b);
}

public class FunctionalInterfaceEx {

	public static void main(String[] args) {
		
		Multiply m = (a,b)-> System.out.println(a*b);
		m.mul(10, 5);
		
	}

}
