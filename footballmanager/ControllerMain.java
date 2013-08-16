package footballmanager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ControllerMain implements ActionListener, Controller{

	private Model model;
	private ViewMain view;
	
	
	protected ControllerMain(Model model, ViewMain view){
		this.model = model;
		this.view = view;
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(view.getNextDayButton())){
			model.newDay();
		}
	}
}
