package footballmanager;

class Attribute {

//------------------------------VARIABLES-------------------------------------------//
	private			short		value;
	
	private			String		name;

	
//------------------------------SETTERS/GETTERS-------------------------------------//
	protected short getValue() {
		return value;
	}
	protected void setValue(short value) {
		this.value = value;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	
	
//-------------------------------CONSTRUCTOR----------------------------------------//
	protected Attribute(short value, String name){
		this.value = value;
		this.name  = name;
	}
}
