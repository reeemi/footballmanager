package footballmanager;

import java.util.Observable;

interface View {

	public void update(Observable model, Object change);

	public void addController(ControllerMain controller);

}