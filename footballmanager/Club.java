package footballmanager;

class Club {

//----------------------------------VARIABLES---------------------------------------//
	private			String			name;
	
	private			Player[]		squad;
	
	private			Coach			coach;
	
	private			int				money;

	
//----------------------------------GETTERS/SETTERS---------------------------------//
	protected String getName() {
		return name;
	}


	protected void setName(String name) {
		this.name = name;
	}


	protected Player[] getSquad() {
		return squad;
	}


	protected void setSquad(Player[] squad) {
		this.squad = squad;
	}


	protected Coach getCoach() {
		return coach;
	}


	protected void setCoach(Coach coach) {
		this.coach = coach;
	}


	protected int getMoney() {
		return money;
	}


	protected void setMoney(int money) {
		this.money = money;
	}	
	
	
//----------------------------------CONSTRUCTOR-------------------------------------//
	protected Club(String name, Player[] squad, Coach coach, int money) {
		super();
		this.name = name;
		this.squad = squad;
		this.coach = coach;
		this.money = money;
	}

}
