package RevisePract;

import java.util.Arrays;
import java.util.List;

public class ThirdHighestSalFromAray {

	public static void main(String[] args) {
		
		int sal[] = {10000,20000,30000,40000,5000,6000,7000,80000,90000};
		int thirdSal = Arrays.stream(sal).boxed()
		.sorted((a,b)-> b-a)
		.distinct()
		.skip(2)
		.findFirst()
		.orElseThrow(()-> new RuntimeException("Array is Emply!"));
		System.out.println("Third Highest Sal: "+thirdSal);
		
		
		List<Integer> salList = Arrays.asList(10000,20000,30000,40000,5000,6000,7000,80000,90000);
		Integer thirdHigh = salList.stream().sorted((a,b)-> b-a).skip(2).findFirst().orElseThrow(()->new RuntimeException("Array is Empty"));
		System.out.println("thirdHigh: "+thirdHigh);
	}

}
