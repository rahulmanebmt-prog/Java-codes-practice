package charCount;

import java.util.HashMap;
import java.util.Map;

public class CharactorCountUsingSimpleHm {

	public static void main(String[] args) {
		
		String str = "Hello, My name is Rahul Mane";
/*		str = str.toLowerCase();
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<=str.length()-1;i++)
		{
			char ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
					
		}
		System.out.println(map);
*/

		str = str.toLowerCase();
		Map<Character, Integer> map1 =  new HashMap<>();
		for(int i=0; i<str.length()-1; i++)
		{
			char ch = str.charAt(i);
			map1.put(ch, map1.getOrDefault(ch, 0)+1);
		}
		System.out.println(map1);
		
	}

}
