package collection;

import java.util.ArrayList;

public class ForEachEx {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("orange");

		al.add("banana");

		al.add("apple");

		al.add("kiwi");

		al.add("grapes");

		al.add("guva");

		al.add("Hello");

		for(String fruits:al) {       //enhanced for loop
			System.out.println(fruits);
		}

	}

}
