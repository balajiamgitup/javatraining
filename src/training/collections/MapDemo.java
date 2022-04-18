package training.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> mp = new HashMap<>();
		mp.put(1, "java");
		mp.put(2, "oracle");
		mp.put(1, "python");
		mp.put(3, "android");
		System.out.println(mp);
		
		Set<Integer> set = mp.keySet();
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			int key =itr.next();
			System.out.println("Keys-->"+key);
			System.out.println("values-->"+mp.get(key));
		}
	}

}
//key is unique in map
//say for example if key is duplicate 
//mp.put(1, "java");
//mp.put(1, "python");
//when ever you insert data to map using put method, 
//it will check if key is already present
//if key is already present then it will replace old value with new Value