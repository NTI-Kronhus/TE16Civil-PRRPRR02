
public class test {
	
	public static void main(String[] args) {
		
		Timer t = new Timer();
		
		t.start(10);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		
		System.out.println("STOP");
		t.stop();
		
		
	}
	
}
