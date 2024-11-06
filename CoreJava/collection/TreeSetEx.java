package collection;

import java.util.Comparator;
import java.util.TreeSet;

//(1)both heterogenous/homogeneous elements are allowed
//
//(2)growable in nature.
//
//(3)lots of utility methods
//Set:-
//
//(4)Duplicates r not allowed 
//
//(5)insertion order is not preserved -alphbetical/ascending order
public class TreeSetEx {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet(new MyOrder());

		ts.add("orange");

		ts.add("banana");

		ts.add("apple");

		ts.add("kiwi");

		ts.add("grapes");

		ts.add("guva");

		System.out.println(ts);

	}
}



class MyOrder implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		return -((String) o1).compareTo((String) o2);
	}
	
}