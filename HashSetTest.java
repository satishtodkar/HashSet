package Hashset;

import java.util.*;

public class HashSetTest {
	
	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		
		//size
		System.out.println("size of set is : " +set.size());
		
		//print all elements
		System.out.println(set);
		if(set.contains(1)) {
			System.out.println("set contains 1");
		}
		if(!set.contains(6)) {
			System.out.println("does not contain");
		}
		set.remove(1);
		if(!set.contains(1)) {
			System.out.println("does not contain 1 - we deleted one ");
		}
		
		//iterator
		Iterator it = set.iterator();
		//hasNext ; next
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
