package JavaCodesRevise;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

	public static void main(String[] args) {
		String str = "Hello, My name is Rahul Mane";
		str = str.toLowerCase();
		Map<Character, Integer> hm = new HashMap<>();
		for(int i=0; i<str.length()-1; i++)
		{
			char ch = str.charAt(i);
			hm.put(ch, hm.getOrDefault(ch, 0)+1);
		}
		 
		System.out.println(hm);
		
	}

}
