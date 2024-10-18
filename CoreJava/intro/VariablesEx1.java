package intro;

public class VariablesEx1 {
	
	static int staticCounter;   //static global var    ---1,1
	
	int instanceCounter;		//instance global var  ---3,3
	
	public void counter() {
		staticCounter=staticCounter+1;
		
		instanceCounter++;
	}
	
	public void display() {
		System.out.println("StaticCounter:-"+staticCounter);
		
		System.out.println("InstanceCounter:-"+instanceCounter);
	}

	public static void main(String[] args) {
		
		VariablesEx1 obj1 = new VariablesEx1();
		
		VariablesEx1 obj2  = new VariablesEx1();
		
		VariablesEx1 obj3 = new VariablesEx1();
		
		obj1.counter();
		
		obj2.counter();
		
		obj3.counter();
		
		obj3.display();
		
		
		
		
		
	}
}
