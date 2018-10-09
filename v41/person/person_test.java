package person;
import javafx.scene.paint.Color;

public class person_test {
	
	public static void main(String[] args) {
		
		Person p = new Person("Joakim",23,Color.YELLOW,Gender.MALE,185.2);
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getLength());
		System.out.println(p.getGender());
		System.out.println(p.getHairColor());
	}

}
