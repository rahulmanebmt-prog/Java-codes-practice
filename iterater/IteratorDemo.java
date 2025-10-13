package Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Shivansh", "Vaishnavi", "Rahul", "Pandhari", "Mane", "Dell");
		Iterator itr = list.iterator();
		
		//System.out.println(itr.hasNext());
		
		
		  while(itr.hasNext()) { 
			 System.out.println("1st: "+itr.next());
			 if(itr.equals("Dell")) 
			 { 
				 itr.remove(); 
			 }
		  
		  }
		 
		
		while(itr.hasNext()) {
			System.out.println("second: "+itr.next());
		}
		

	}

}
