package interfejs;

public class animal_test {

	public static void main(String[] args) {
		
		Animal[] arr = new Animal[2];
		
		Fish s = new Salmon();
		s.swim();

		arr[0]  = s;
		Bird a = new Albatross();
		a.fly();

		arr[1]  = a;
	}
}
