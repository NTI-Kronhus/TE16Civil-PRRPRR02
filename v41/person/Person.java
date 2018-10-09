package person;
import javafx.scene.paint.Color;

public class Person {

	private int age;
	private String name;
	private Color hairColor;
	private Gender gender;
	private double length;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age, Color hColor, Gender gender, double length) {
		this.name = name;
		this.age = age;
		this.hairColor = hColor;
		this.gender = gender;
		this.length = length;
	}

	public double getLength() {
		return this.length;
	}

	public void setLength(double length) {
		if (length > this.length) {
			this.length = length;
		} else if (length < this.length && age >= 65) {
			this.length = length;
		}
	}

	public Gender getGender() {
		return this.gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Color getHairColor() {
		return this.hairColor;
	}

	public void setHairColor(Color color) {
		if (color != Color.PINK) {
			this.hairColor = color;
		}
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

}
