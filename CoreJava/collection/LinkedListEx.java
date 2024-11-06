package collection;

import java.util.LinkedList;
//(1)both heterogenous/homogeneous elements are allowed
//
//(2)growable in nature.
//
//(3)lots of utility methods
//List:-
//
//(4)Duplicates r allowed 
//
//(5)insertion order is preserved

public class LinkedListEx {
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.add(123);

		ll.add("Hello");

		ll.add(3.14f);

		ll.add('c');

		ll.add(true);

		ll.add(123);

		ll.add("Hello");

		ll.add(3.14f);

		ll.add('c');

		ll.add(true);
		
		System.out.println(ll);

	}

}
