package footballmanager;

import java.util.Observable;

class Model extends Observable {
	private Calendar calendar;
	
	protected Model(ViewMain footballManagerView) {
		this.calendar = new Calendar();
		this.addObserver(footballManagerView);
		this.setChanged();
		this.notifyObservers(this.calendar);
	}
	
	protected void newDay() {
		this.calendar.newDay();
		this.setChanged();
		this.notifyObservers(this.calendar);
	}
}
