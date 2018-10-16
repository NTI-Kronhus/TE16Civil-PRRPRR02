package interfejs;

public class Penguin extends Bird implements Swimable {

	@Override
	public void fly() {
		System.out.println("Penguins can't fly :(");
	}

	@Override
	public void swim() {
		System.out.println("The penguin swam away");
	}

}
