package functionalInterface;

@FunctionalInterface
interface Addition{
	void add(int a, int b);
	
}

public class FunctionalInterfaceUsingLambda {

	public static void main(String[] args) {
		
		Addition ad = (a,b)->{
			System.out.println(a+b);
		};
		
		ad.add(10, 15);
		
		
	}

}
