package Hashset;

import java.util.*;

public class Hashset1 {
	
	public static void main(String[] args) {
		HashSet <String> set = new HashSet();
		
		set.add("one");
		set.add("Two");
		set.add("Three");
		set.add("one");
		set.add("Four");
		set.add("Five");
		
		Iterator<String> i = set.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
