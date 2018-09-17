package faroo;

import java.util.logging.Logger;

public class Person {
	
	Logger l = Logger.getLogger(Person.class.getName());
	
	private String firstName;
	private String lastName;
	private String eyeColor;
	private int age;
	private int height;
	private int weight;
	private String gender;
	public Person() {

}
	
	public Person(String firstname, String lastname, int age, int height, int weight, String eyeColor, String gender) {
		this.firstName = firstname;
		this.lastName = lastname;
		this.age = age;
		this.height = height;
		this.eyeColor = eyeColor;
		this.gender = gender;
		this.weight = weight;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		int giga = height;
		if (gender.equals("Male"))
			giga = height + 5;
		else {
			giga = height + 3;
			Logger.getLogger("Person").info("Being honest about height");
			
			//this is a form of compound if and else statement where giga is the variable created and passed the condition!!
			//notice the steps of the syntax	
		}
		
		return giga;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return (gender.equals("Female")) ? (weight + 10) : (weight + 20);
		
		
		//nice syntax of if and else statement, condition is passed in the method before the ? sign
		//if passed after the ? sign 
		//else passed after the : sign
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int method1() {
		int a = 10;
		int b = 7;
		int c = 0;
		
		if (b >= a)
			c++;
		b = -47;
		if (b > c)
			c = b;
		
		return c;
	}
	}

