package RevisePract;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CharactorCount {

	public static void main(String[] args) {
		
		String str = "Hello My name is Rahul";
		str = str.toLowerCase();
		Map<Character, Long> map = str.chars().mapToObj(i-> (char) i).filter(i-> i != ' ').collect(Collectors.groupingBy(i->i, Collectors.counting()));
		System.out.println(map);
	
		Map<Character, Integer> hs = new HashMap<>();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			hs.put(ch, hs.getOrDefault(ch, 0)+1);
			
		}
		System.out.println(hs);
		
		
	}

}
