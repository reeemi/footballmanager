package footballmanager;

import java.util.Observable;

class Model extends Observable {
	
	//-------------------------------------VARIABLES-----------------------------------------//
	private Calendar calendar;
	
	private State state;
	
	
	enum State { MAIN, TRAINING };
	
	
	//-------------------------------------CONSTRUCTORS--------------------------------------//
	protected Model(ViewMain footballManagerView) {
		this.calendar = new Calendar();
		this.addObserver(footballManagerView);
		this.setChanged();
		this.notifyObservers(this.calendar);
	}
	
	
	//------------------------------------METHODS-------------------------------------------//
	protected void newDay() {
		this.calendar.newDay();
		this.setChanged();
		this.notifyObservers(this.calendar);
	}
	
	
}
