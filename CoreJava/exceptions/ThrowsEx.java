package exceptions;

import java.io.FileNotFoundException;

public class ThrowsEx {
	
	public static int div(int a,int b) throws ArithmeticException,FileNotFoundException{
		
		return (a/b);
		
	}
	public static void main(String[] args) throws ArithmeticException, FileNotFoundException {
		
		System.out.println(div(20,0));
	}

}
