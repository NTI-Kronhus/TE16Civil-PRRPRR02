package iterator_pattern;

public interface IIterator<E> {

	public boolean hasNext();

	public E getNext();

}
