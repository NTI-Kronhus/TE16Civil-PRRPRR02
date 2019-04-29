package iterator_pattern;

public class Blombukett implements IIterable<Flower> {

	private Flower[] flowers = { new Flower("Solros"), new Flower("Blåsippa"), new Flower("Tulpan") };

	class FlowerIterator implements IIterator<Flower> {

		private int nextIndex = 0;

		@Override
		public boolean hasNext() {
			if (nextIndex < flowers.length) {
				return true;
			}
			return false;
		}

		@Override
		public Flower getNext() {
			if (hasNext()) {
				Flower f = flowers[nextIndex];
				nextIndex++;
				return f;
			} else {
				return null;
			}
		}

	}

	@Override
	public IIterator<Flower> getIterator() {
		return new FlowerIterator();
	}

}
