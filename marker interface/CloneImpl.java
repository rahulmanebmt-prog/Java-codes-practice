package markerInterface_Clonable;

public class CloneImpl implements Cloneable{
	
	int i=10;
	String s;
	
	public CloneImpl(int i, String s) {
		this.i=i;
		this.s = s;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		
		CloneImpl c1 = new CloneImpl(20,"Rahul");
		CloneImpl c2 =(CloneImpl) c1.clone();
		
		System.out.println(c1.i);
		System.out.println(c1.s);
		
		System.out.println(c2.i);
		System.out.println(c2.s);
		
	}

}
