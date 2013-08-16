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
		if(dates.containsKey(day)){
			dates.get(day).executeEvents();
		}
		this.day++;
		return this;
	}

	protected void addEvent(int date, Event event) {
		if (this.dates.containsKey(date)) {
			this.dates.get(date).addEvent(event);
		} else {
			this.dates.put(date, new Date(date, event));
		}
	}
	
	protected int getDay() {
		return this.day;
	}

}
