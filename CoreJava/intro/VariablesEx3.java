package intro;

public class VariablesEx3 {
	
	static String Nationality = "Indian";
	
	int Aadhar ;
	
	
	public String display() {
		return ("Aadhar:-"+Aadhar+"     Nationality:-"+Nationality);
	}
	
	public static void main(String[] args) {
		
		VariablesEx3 Ramesh = new VariablesEx3();
		
		VariablesEx3 Suresh = new VariablesEx3();
		
		VariablesEx3 Naresh = new VariablesEx3();
		
		Ramesh.Aadhar=234234234;
		
		Suresh.Aadhar=353453453;
		
		Naresh.Aadhar=239472938;
		
		System.out.println("Ramesh:-"+Ramesh.display());
		
		System.out.println("Suresh:-"+Suresh.display());
		
		System.out.println("Naresh:-"+Naresh.display());
		
		
	}

}
