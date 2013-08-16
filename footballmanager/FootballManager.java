package footballmanager;

class FootballManager {

	public static void main(String[] args) {
		ViewMain view = new ViewMain();
		Model model = new Model(view);
		ControllerMain controller = new ControllerMain(model, view);
		view.addController(controller);

	}

}
