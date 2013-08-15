package footballmanager;

import java.util.ArrayList;
import java.util.List;

class Day {

	// -------------------------------VARIABLES---------------------------------------//
	private int day; // TODO: Add more date information later!
	private List<Event> events;

	// ------------------------------CONSTRUTORS--------------------------------------//
	protected Day(int onDay, Event event) {
		this.day = onDay;
		// this.event = event;
		this.events = new ArrayList<Event>();
		this.events.add(event);
	}
	
	// ------------------------------METHODS------------------------------------------//
	protected Day addEvent(Event event) {
		this.events.add(event);
		return this;
	}
	
	// ---------------------------GETTER/SETTER---------------------------------------//
	protected int getDayValue() {
		return this.day;
	}

}
