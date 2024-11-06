package collection;

import java.util.HashSet;

//(1)both heterogenous/homogeneous elements are allowed
//
//(2)growable in nature.
//
//(3)lots of utility methods
//Set:-
//
//(4)Duplicates r not allowed 
//
//(5)insertion order is not preserved - random order

public class HashSetEx {
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		hs.add(123);

		hs.add("Hello");

		hs.add(3.14f);

		hs.add('c');

		hs.add(true);
		
		hs.add(123);

		hs.add("Hello");

		hs.add(3.14f);

		hs.add('c');

		hs.add(true);
		
		
		System.out.println(hs);
	}

}
