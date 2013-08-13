package footballmanager;

abstract class Person {
	
//--------------------------------VARIABLES-----------------------------------------//
	protected 		short 			age;
	
	private			String 			lastName;
	
	private 		String 			firstName;
	
	private			Attribute[]		attributes;
	
	
//------------------------------SETTERS/GETTERS-------------------------------------//
	protected short getAge() {
		return age;
	}

	protected void setAge(short age) {
		this.age = age;
	}

	protected String getLastName() {
		return lastName;
	}

	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}

	protected String getFirstName() {
		return firstName;
	}

	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	

//-----------------------------------CONSTRUCTOR------------------------------------//
	protected Person(short age, String lastName, String firstName, Attribute[] attributes){
		this.age = age;
		this.lastName = lastName;
		this.firstName = firstName;
		this.attributes = attributes;
	}
	
}
