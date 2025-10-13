package streams;

import java.util.Arrays;
import java.util.Optional;

public class ThirdHighestSalUsingStream {

	public static void main(String[] args) {
		
		int sal[] = {2000,3000,3500,4000,5000,6000};
		 int thirdHighest = Arrays.stream(sal)
					.boxed() // Convert int to Integer because streams does not allow primitive
					.sorted((a,b)-> b-a)
					.distinct()
					.skip(2)
					.findFirst().orElseThrow(()-> new RuntimeException("Salary is not present"));
					
		System.out.println(thirdHighest);

	}

}
