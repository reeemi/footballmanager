package footballmanager;

import java.util.ArrayList;
import java.util.List;

class Date {

	// -------------------------------VARIABLES---------------------------------------//
	private int day; // TODO: Add more date information later!
	private List<Event> events;

	// ------------------------------CONSTRUTORS--------------------------------------//
	protected Date(int onDay, Event event) {
		this.day = onDay;
		// this.event = event;
		this.events = new ArrayList<Event>();
		this.events.add(event);
	}
	
	// ------------------------------METHODS------------------------------------------//
	protected Date addEvent(Event event) {
		this.events.add(event);
		return this;
	}
	
	protected void executeEvents(){
		for(Event e: events){
			e.execute();
		}
	}
	
	// ---------------------------GETTER/SETTER---------------------------------------//
	protected int getDayValue() {
		return this.day;
	}

}
