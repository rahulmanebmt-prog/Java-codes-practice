package SortStringByCountOfWords;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortStringByCountOfWords {

	public static void main(String[] args) {
		
		String str = "Hello, My name is Rahul Mane";
/*		String[] words = str.split(" ");

		List<String> list = Arrays.asList(words);
		List<String> sortedList =  list.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
		
		for(String i: sortedList)
		{
			System.out.print(i+" "); 
		}
		
		System.out.println();System.out.println();
		
		List<String> sort2 = list.stream().sorted(Comparator.comparingInt(strCom->strCom.length())).collect(Collectors.toList());
		for(String i : sort2)
		{
			System.out.print(i+" ");
		}
	*/
		String[] words = str.split(" ");
		List<String> list = Arrays.asList(words);
		List<String> sortedStr = list.stream().sorted(Comparator.comparingInt(i->i.length())).collect(Collectors.toList());
		System.out.println(sortedStr);
	}

}
