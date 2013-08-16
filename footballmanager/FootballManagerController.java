package footballmanager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class FootballManagerController implements ActionListener{

	private FootballManagerModel model;
	private FootballManagerView view;
	
	
	protected FootballManagerController(FootballManagerModel model, FootballManagerView view){
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
