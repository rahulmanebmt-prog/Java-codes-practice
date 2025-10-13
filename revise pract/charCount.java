package RevisePract;

import java.util.Map;
import java.util.stream.Collectors;

public class charCount {
	public static void main(String[] args) {
		String str = "Hello, My name is Rahul Mane. What's your name?";
		//str.chars().mapToObj(i-> (char) i).collect(Collectors.groupingBy(i->i, Collectors.counting()));
		
		Map<Character, Long> charCount = str.chars().mapToObj(i-> (char) i).collect(Collectors.groupingBy(i->i, Collectors.counting()));
		System.out.println(charCount);
		
		
	}

}
