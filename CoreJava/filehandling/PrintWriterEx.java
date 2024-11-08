package filehandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterEx {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter pw = new PrintWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\November.txt");
		
		pw.println(1234);
	
		pw.println("good \n morning");
		
		pw.println(true);
		
		char[] ch = {'a','b','c','d','e','f'};
		
		pw.println(ch);
		
		pw.flush();
		
		pw.close();
		
		System.out.println("The data is written into the file successfully");
		
		
		
		
		
		
	}

}
