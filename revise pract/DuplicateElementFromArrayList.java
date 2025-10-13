package RevisePract;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementFromArrayList {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Rahul", "Shivansh", "Shivansh", "Vaishnavi", "Vaishnavi", "Mane");
/*		Set<String> hs = new HashSet<>();
		List<String> unique = list.stream().filter(i-> !hs.add(i)).collect(Collectors.toList());
		System.out.println(unique);
		
		Map<String, Long> countStr = list.stream().collect(Collectors.groupingBy(i->i, Collectors.counting()));
		System.out.println(countStr);
		countStr.entrySet().stream().filter(i-> i.getValue()>1).forEach(i-> System.out.println(i.getKey()));
*/		
		Set<String> hs1 = new HashSet<>();
		List<String> uniqueStr =  list.stream().filter(i-> !hs1.add(i)).collect(Collectors.toList());
		System.out.println(uniqueStr);
		
		Map<String, Long> countNew = uniqueStr.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
		System.out.println(countNew);
	}

}
