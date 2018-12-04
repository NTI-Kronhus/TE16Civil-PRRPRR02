package threads;

public class counting {

	public static int id = 0;

	public static synchronized int getID() {
		return ++id;
	}

	public static void main(String[] args) {

		Runnable r = () -> {
			System.out.println(Thread.currentThread().getName() + " : " + getID());
		};

		new Thread(r).start();
		new Thread(r).start();
	}

}
