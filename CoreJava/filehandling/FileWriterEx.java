package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\November.txt");
		
		fw.write(1234);
		
		fw.write("good \n morning");
		
		char[] ch = {'a','b','c','d','e','f'};
		
		fw.write(ch);
		
		fw.flush();
		
		fw.close();
		
		System.out.println("The data is written into the file successfully");
		
		//boolean values are not allowed
		
		//no new line creation
		
		//it can't read the int values
		
		
	}

}
