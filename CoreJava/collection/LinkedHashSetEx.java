package collection;

import java.util.LinkedHashSet;

//(1)both heterogenous/homogeneous elements are allowed
//
//(2)growable in nature.
//
//(3)lots of utility methods
//Set:-
//
//(4)Duplicates r not allowed 
//
//(5)insertion order is preserved -insertion order

public class LinkedHashSetEx {

	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add(123);

		lhs.add("Hello");

		lhs.add(3.14f);

		lhs.add('c');

		lhs.add(true);

		lhs.add(123);

		lhs.add("Hello");

		lhs.add(3.14f);

		lhs.add('c');

		lhs.add(true);
		
		System.out.println(lhs);
	}
}
