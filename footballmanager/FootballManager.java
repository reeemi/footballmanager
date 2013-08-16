package footballmanager;

class FootballManager {

	public static void main(String[] args) {
		FootballManagerView view = new FootballManagerView();
		view.initialize();
		FootballManagerModel model = new FootballManagerModel(view);
	}

}
