package interfejs;

import java.util.ArrayList;
import java.util.Collections;

public class person_test {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		Person p1 = new Person();
		
		ArrayList<Person> persons = new ArrayList<Person>();
		
		persons.add(p);
		persons.add(p1);
		
		Collections.sort(persons);
		
		
	}

}
