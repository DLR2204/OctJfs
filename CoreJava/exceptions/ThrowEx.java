package exceptions;

import java.io.FileNotFoundException;

public class ThrowEx {
	
	public static void valid(int age) {
		
		if(age>18) {
			System.out.println("Yor r eligible to vote");
		}
		else {
			throw new ArithmeticException();
		}
		
	}
	
	
	public static void main(String[] args) {
		
		valid(12);
	}

}
