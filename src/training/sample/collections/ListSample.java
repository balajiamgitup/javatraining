package training.sample.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSample {
	public static void main(String[] args) {
		//create an empty array list as below
		List<Integer> lst = new ArrayList<>();

		//size method will give number of elements in arraylist
		//initially there will be no values so size will be zero
		System.out.println(lst.size());
		
		lst.add(1);//to add elements to list
		lst.add(3);
		lst.add(5);
		lst.add(4);
		lst.add(6);
		lst.add(7);
		//after adding values the size will be the number of elements
		
		System.out.println("Before Sort...");
		for(Integer a:lst) {
			System.out.println(a);
		}
		System.out.println("After Sort..");
		
		Collections.sort(lst);//to sort elements in list
		
		for(Integer a:lst) {
			System.out.println(a);
		}
		
		lst.remove(1);//remove element at index 1
		
		System.out.println("\nAfter remove element...\n"+lst);
		
		lst.clear();
		
		System.out.println("\nAfter...\n"+lst);

	}
}
