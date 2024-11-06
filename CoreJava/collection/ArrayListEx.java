package collection;

import java.util.ArrayList;

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

public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(123);

		al.add("Hello");

		al.add(3.14f);

		al.add('c');

		al.add(true);

		al.add(123);

		al.add("Hello");

		al.add(3.14f);

		al.add('c');

		al.add(true);
		
		System.out.println(al);

	}

}
