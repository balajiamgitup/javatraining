package training.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	//Set is used to store unique (non-duplicate) values
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(3);
		set.add(2);
		set.add(6);
		System.out.println(set);

		
		set.remove(6);
		
		//since we cant get values using index, we use iterator
		//iterator will loop through the elements in set
		//create instance of iterator as below
		Iterator<Integer> itr = set.iterator();
//		
//		iterator.hasNext() method will give your whether there are elements 
//		available in the set
		while (itr.hasNext()) {
//			using itr.next() method we can get the values inside set
			System.out.println(itr.next());
		}
		
		
		
	}
}


