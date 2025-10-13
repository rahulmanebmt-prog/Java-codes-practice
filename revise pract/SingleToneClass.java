package RevisePract;

public class SingleToneClass {
	
	public static SingleToneClass s;
	
	private SingleToneClass() {
		
	}
	
	public static SingleToneClass getInstance() {
		if(s == null)
		{
			s = new SingleToneClass();
		}
		return s;
		
	}
	
	public static void main(String[] args) {
		SingleToneClass s1 = SingleToneClass.getInstance();
		System.out.println(s1.toString());
		SingleToneClass s2 = SingleToneClass.getInstance();
		System.out.println(s2.toString());
		

	}

}
