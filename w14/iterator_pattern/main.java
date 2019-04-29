package iterator_pattern;

public class main {

	public static void main(String[] args) {

		Blombukett bukett = new Blombukett();
		IIterator<Flower> iterator = bukett.getIterator();
		for (;iterator.hasNext();) {
			Flower f = iterator.getNext();
			System.out.println(f);
		}
	}
}
