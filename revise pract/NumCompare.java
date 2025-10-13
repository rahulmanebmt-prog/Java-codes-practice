package RevisePract;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NumCompare {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1000,4000,2000,3000,7000,5000);
/*		
//		List<Integer> collect = list.stream().sorted((a,b)->b-a).collect(Collectors.toList());
//		System.out.println(collect);
		
		List<Integer> L1=list.stream().sorted().collect(Collectors.toList()).reversed();
//		Collections.reverse(L1);
		System.out.println(L1);
		
	*/	
		List<Integer> sortedOrder = list.stream().sorted().collect(Collectors.toList()).reversed();
		System.out.println(sortedOrder);
		
//		List<Integer> sortedOrder1 = list.stream().sorted((a,b)->b-a).collect(Collectors.toList());
//		System.out.println(sortedOrder1);
		
		List<Integer> sorted2 = list.stream().sorted().collect(Collectors.toList()).reversed();
		System.out.println("Sorted2: "+sorted2);
	}

}
