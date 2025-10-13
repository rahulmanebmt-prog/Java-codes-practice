package ImmutableAndSingletoneClass;

 class SingleToneEx
{
	private static SingleToneEx s;
	
	private SingleToneEx()
	{
		
	}
	
	public static SingleToneEx getInstance() {
		if(s == null)
		{
			s = new SingleToneEx();
		}
		return s;
		
	}
	

public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

}

public class SigleToneCLass {

	public static void main(String[] args) {
		SingleToneEx single = SingleToneEx.getInstance();
		System.out.println(single);
		single.showMessage();

	}

}
