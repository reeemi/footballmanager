package footballmanager;

class FootballManager {

	public static void main(String[] args) {
		FootballManagerView view = new FootballManagerView();
		FootballManagerModel model = new FootballManagerModel(view);
		FootballManagerController controller = new FootballManagerController(model, view);
		view.addController(controller);

	}

}
