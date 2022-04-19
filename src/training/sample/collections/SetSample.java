package training.sample.collections;

import java.util.HashSet;
import java.util.Set;

public class SetSample {
/*
 * Set will accept only unique values inside it
 * it will not maintain any order
 * the order is based on the hashing mechanism
 * if you want to maintain order please refer LinkedHashSet or TreeSet
 * */
	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("a");
		
		System.out.println(s.size());//gives total number of elements in set
		
		
	}
}
