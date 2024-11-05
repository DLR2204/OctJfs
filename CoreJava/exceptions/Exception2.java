package exceptions;

class AgeNotValidException extends Exception{
	
	
	private int age;     //instance global variable
	
	public AgeNotValidException(int age) {
	
		this.age = age;
	}
	
}


public class Exception2 {
	
	public static void validation(int age) throws AgeNotValidException {
		
		if(age>18) {
			System.out.println("You are eligible to vote....");
		}
		
		else {
			throw new AgeNotValidException(age);
		}
		
	}
	
	public static void main(String[] args) throws AgeNotValidException {
		
		validation(12);
	}

}
