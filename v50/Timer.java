
public class Timer implements Runnable {

	private Thread thread;
	private int time;

	public void start(int time) {

		if(time <= 0 || this.time > 0) {
			return;
		}
		
		this.time = time;
		thread = new Thread(this);
		thread.start();

	}

	public void stop() {
		
		time = 0;
		try {
			thread.notify();
		}catch(Exception e) {}
		
	}
	
	@Override
	public void run() {

		while (time > 0) {
			System.out.println(time);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			time--;
		}
		
		System.out.println("KLART!");

	}

}
