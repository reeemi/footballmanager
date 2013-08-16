package footballmanager;

import java.util.HashMap;
import java.util.Map;

class Calendar {
	// -----------------------------------VARIABLES--------------------------------------//
	private int day;
	private Map<Integer, Date> dates;

	// -----------------------------------CONSTRUCTORS-----------------------------------//
	private Calendar(int day, Map<Integer, Date> days) {
		this.day = day;
		this.dates = days;
	}

	protected Calendar() {
		this(0, new HashMap<Integer, Date>());
	}

	// ---------------------------------METHODS------------------------------------------//
	protected Calendar newDay() {
		this.day++;
		return this;
	}

	protected void addEvent(int onDay, Event event) {
		if (this.dates.containsKey(onDay)) {
			// change the existing day value
		} else {
			this.dates.put(onDay, new Date(onDay, event));
		}
	}
	
	protected int getDay() {
		return this.day;
	}

}
