package threads;

public class dice_simulator {

	static int[] result = new int[6];

	public static void main(String[] args) {

		Runnable r = () -> {

			for (int i = 0; i < 100000; i++) {
				int dice = (int) (Math.random() * 6);
				synchronized (result) {
					result[dice]++;
				}

			}

		};

		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		Thread t4 = new Thread(r);

		t1.start();
		t2.start();
		t3.start();
		t4.start();

		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		int tot = 0;
		for (int i = 0; i < result.length; i++) {
			System.out.println("Antal " + (i + 1) + ":or " + result[i]);
			tot += result[i];
		}
		System.out.println(tot);

	}

}
