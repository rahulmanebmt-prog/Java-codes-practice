package StringReverse;

public class StrRevUsingStrBuffer {

	public static void main(String[] args) {
		 String str = "Hello My name is Rahul";
		 StringBuffer sb = new StringBuffer(str);
		 System.out.println(sb.reverse());
		 
		StringBuilder sb1 = new StringBuilder(str);
		sb1.reverse();
		System.out.println(sb1);
	}

}
