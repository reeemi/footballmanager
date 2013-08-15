package footballmanager;

import java.util.HashMap;
import java.util.Map;

class Calendar {
	// -----------------------------------VARIABLES--------------------------------------//
	private int daysPassed;
	private Map<Integer, Day> days;

	// -----------------------------------CONSTRUCTORS-----------------------------------//
	private Calendar(int daysPassed, Map<Integer, Day> days) {
		this.daysPassed = daysPassed;
		this.days = days;
	}

	protected Calendar() {
		this(0, new HashMap<Integer, Day>());
	}

	// ---------------------------------METHODS------------------------------------------//
	protected Calendar newDay() {
		this.daysPassed++;
		return this;
	}

	protected void addEvent(int onDay, Event event) {
		if (this.days.containsKey(onDay)) {
			// change the existing day value
		} else {
			this.days.put(onDay, new Day(onDay, event));
		}
	}

}
