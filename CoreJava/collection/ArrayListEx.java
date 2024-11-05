package collection;

import java.util.ArrayList;

//(1)both heterogenous/homogeneous elements are allowed
//
//(2)growable in nature.
//
//(3)lots of utility methods

public class ArrayListEx {
	
	public static void main(String[] args) {
		
		
		ArrayList al = new ArrayList();
		
		al.add(12);
		
		al.add("hello");
		
		al.add(3.14f);
		
		al.add(true);
		
		System.out.println(al);
		
		al.add("hi");
		
		System.out.println(al);
		
	}

}
