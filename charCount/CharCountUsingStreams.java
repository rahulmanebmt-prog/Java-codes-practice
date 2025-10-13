package charCount;

import java.util.Map;
import java.util.stream.Collectors;

public class CharCountUsingStreams {

	public static void main(String[] args) {
		String str = "Hello, My name is Rahul Mane";
		
		Map<Character, Long> charCount = str.chars().mapToObj(i-> (char) i).collect(Collectors.groupingBy(i->i, Collectors.counting()));
		System.out.println(charCount);
		
		
		
		Map<Character, Long> charCount1 = str.chars().mapToObj(i-> (char) i).collect(Collectors.groupingBy(i->i, Collectors.counting()));
		System.out.println(charCount1);
	}

}
