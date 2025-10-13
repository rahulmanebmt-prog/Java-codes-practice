package streams;

import java.util.Arrays;
import java.util.List;

public class ThirdMaxSal {

	public static void main(String[] args) {
		
		List<Integer> sal = Arrays.asList(3000,2000,5000,4000,6000,900,500);
		int secondHigh = sal.stream().sorted((a,b)-> b-a).distinct()
		.skip(1).findFirst()
		.orElseThrow(()-> new RuntimeException("Value is not present"));
		System.out.println(secondHigh);
		
		
	}

}
