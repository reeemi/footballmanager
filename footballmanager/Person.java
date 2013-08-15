package footballmanager;

abstract class Person {

	// --------------------------------VARIABLES-----------------------------------------//
	protected byte age;

	private String lastName;

	private String firstName;

	// ------------------------------SETTERS/GETTERS-------------------------------------//
	protected short getAge() {
		return age;
	}

	protected void setAge(byte age) {
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

	// -----------------------------------CONSTRUCTOR------------------------------------//
	protected Person(byte age, String lastName, String firstName) {
		this.age = age;
		this.lastName = lastName;
		this.firstName = firstName;
	}

}
