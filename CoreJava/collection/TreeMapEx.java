package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		
		TreeMap tm = new TreeMap();
		
		tm.put(106,"Likitha");
		
		tm.put(108,"Rakesh");
		
		tm.put(102,"Ramesh");
		
		tm.put(103,"Suresh");
		
		tm.put(104,"Naresh");
		
		tm.put(101,"Mahesh");
		
		tm.put(105,"Rajesh");
		
//		System.out.println(tm);
		
		Set set = tm.keySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			
			int keys = (int) itr.next();
			
			System.out.println(keys +" = "+tm.get(keys));
		}
		
		
		
	}
}
