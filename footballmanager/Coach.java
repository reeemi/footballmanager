package footballmanager;

class Coach extends Person {

//------------------------------------VARIABLES-------------------------------------//
	private 		byte		experience;
// -----------------------------------CONSTRUCTOR-----------------------------------//	
	protected Coach(byte age, String lastName, String firstName, byte experience) {
		super(age, lastName, firstName);
		this.experience = experience;
	}
	
}
