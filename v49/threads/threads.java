package threads;

public class threads {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getState());
	
		
		MyThread t = new MyThread();
		System.out.println(t.getState());
		t.start();
		System.out.println(t.getState());
		Thread.sleep(1000);
		System.out.println(t.getState());
		
		
		Runnable r = new Runnable() {

			@Override
			public void run() {

				System.out.println("hej från Runnable");

			}
			
		};
		
		Runnable r2 = () -> {
			System.out.println("HEJ");
		};
		
		Thread t2 = new Thread(r);
		t2.start();
		
		System.out.println("HEJ");
		
	}

}

class MyThread extends Thread{
	

	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		
	}
	
}