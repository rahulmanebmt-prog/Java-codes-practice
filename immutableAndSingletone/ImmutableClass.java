package ImmutableAndSingletoneClass;

/*
	Immutable class is a class whose object can not be change once it's initialize
	If no value is assigned to it then using class constructor value can assigned to it
	We can make class Immutable by using final keyword to it so nobody can extend it 
	and can't change it's value.
	then we will make variables private and final so it can access out of class and 
	can't change it's value.
	Also we can retrive it's value by public getters but there is no setters, 
	to set new values to variables 
*/
final class ImmutableClassEx{
	private final int a;
	private final int b = 10;
	
	public ImmutableClassEx(int a) {
		this.a = a;
		//this.b=b;
		
	}
	
	public int getA()
	{
		return a;
	}
/*	
	public void setA(int a)
	{
		this.a = a;
	}
*/
}

public class ImmutableClass {

	public static void main(String[] args) {
		
		ImmutableClassEx im = new ImmutableClassEx(20);
		System.out.println(im.getA());
		ImmutableClassEx im1 = new ImmutableClassEx(30);
		System.out.println(im1.getA());
		System.out.println(im.getA());

	}

}
