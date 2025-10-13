package JavaCodesRevise;

import java.util.Map;
import java.util.stream.Collectors;

public class charCountUsingStreams {

	public static void main(String[] args) {
		
		String str = "Hello, My name is Rahul Mane";
		
		Map<Character,Long> collect = str.chars().mapToObj(i->(char)i).filter(i-> i!=' ').collect(Collectors.groupingBy(i->i,Collectors.counting()));
		System.out.println(collect);

	}

}
