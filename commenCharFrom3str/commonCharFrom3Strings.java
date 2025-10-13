package commonCharFrom3Strings;

public class commonCharFrom3Strings {

	public static void main(String[] args) {
		
		String a = "abc";
		String b = "acd";
		String c = "aeoc";
		
		String common = "";
		
		char[] charArray = a.toCharArray();
		
		for(char ch: charArray) {
			if(a.indexOf(ch) != -1 && b.indexOf(ch) !=-1 && c.indexOf(ch) != -1)
			{
				common = common + ch;
			}
		}
		
		System.out.println("Common char: "+common);
		
	}

}
