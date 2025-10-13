package JavaCodesRevise;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Shivansh", "Vaishnavi", "Rahul", "Pandhari", "Mane", "Dell");
		Iterator itr = names.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			if(itr.equals("Dell"))
			{
				itr.remove();
			}
		}
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}


	}

}
