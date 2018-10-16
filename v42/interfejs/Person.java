package interfejs;

public class Person implements Comparable<Person>{

	String firstName;
	String lastName;

	@Override
	public int compareTo(Person p) {
		
		if(this.lastName.compareTo(p.lastName) == 0){
			return this.firstName.compareTo(p.firstName);
		}
		else{
			return this.lastName.compareTo(p.lastName);
		}

	}

	

	
}
