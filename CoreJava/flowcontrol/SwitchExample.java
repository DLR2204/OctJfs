package flowcontrol;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your obtained marks:-");
		
		float om = scan.nextFloat();
		
		System.out.print("Enter your max marks:-");
		
		float mm = scan.nextFloat();
		
		float percentage = (om/mm)*100;
		
		System.out.println("The percentage is :-"+percentage);
		
		int gpa = (int) (percentage/10);
		
		System.out.println(gpa);
	
		System.out.print("Your grade is:-");
		
		switch(gpa) {
		case 10:{
				System.out.println("Ex");	
			
			break;
		}
		
		case 9:{
			System.out.println("Ex");	
			
			break;
		}
		case 8:{System.out.println("A");
			break;
		}
		case 7:{System.out.println("B");
			break;
		}
		
		case 6:{
			System.out.println("C");
			break;
		}
		
		case 5:{System.out.println("D");
			break;
		}
		case 4:{System.out.println("E");
			break;
		}
	
		default:{System.out.println("F");
			break;
		}
			
		
		
		}
		
		
	}
}
