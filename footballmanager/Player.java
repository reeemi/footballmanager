package footballmanager;

class Player extends Person {

	// -----------------------------------VARIABLES--------------------------------------//
	private byte skill;

	// -----------------------------------CONSTRUCTOR------------------------------------//
	protected Player(byte age, String lastName, String firstName, byte skill) {
		super(age, lastName, firstName);
		this.skill = skill;
	}
}
