package strings;

public class MutliThreadingEx implements Runnable {

	@Override
	public void run() {
	
		for(int i = 1;i<11;i++) {
			System.out.println(i+".ChildThread");
		}
		
	}

	
	public static void main(String[] args) {
		
		
		MutliThreadingEx obj = new MutliThreadingEx();
		
		Thread thread = new Thread(obj);
		
		thread.start();   //calling run method 
		
		
		for(int i = 11;i<21;i++) {
			System.out.println(i+".MainThread");
		}
		
	}
}
