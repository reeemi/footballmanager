package footballmanager;

import java.awt.FlowLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class FootballManagerView implements Observer {
	
	
	//------------------------------------VARIABLES-----------------------------------------//
	private static final int MAIN_FRAME_WIDTH = 500;
	private static final int MAIN_FRAME_HEIGHT = 500;
	
	private static final int DAY_LABEL_WIDTH = 30;
	private static final int DAY_LABEL_HEIGHT = 40;
	
	private static final int NEXT_DAY_BUTTON_WIDTH = 30;
	private static final int NEXT_DAY_BUTTON_HEIGHT = 40;
	
	
	private JFrame mainFrame;
	private JLabel dayLabel;
	private JButton nextDayButton;

	
	//----------------------------------GETTERS/SETTERS-------------------------------------//
	protected JButton getNextDayButton() {
		return nextDayButton;
	}

	
	//------------------------------------CONSTRUCTOR--------------------------------------//
		protected FootballManagerView(){
			this.initialize();
		}
	
	
	//-----------------------------------METHODS-------------------------------------------//
	protected void initialize() {
		this.mainFrame = new JFrame();
		this.mainFrame.setSize(MAIN_FRAME_WIDTH, MAIN_FRAME_HEIGHT);
		this.mainFrame.setLayout(new FlowLayout());
		
		this.dayLabel = new JLabel();
		this.dayLabel.setSize(DAY_LABEL_WIDTH, DAY_LABEL_HEIGHT);
		this.dayLabel.setVisible(true);
		
		this.nextDayButton = new JButton();
		this.nextDayButton.setSize(NEXT_DAY_BUTTON_WIDTH, NEXT_DAY_BUTTON_HEIGHT);
		this.nextDayButton.setVisible(true);
		this.nextDayButton.setText("Next day");
		
		this.mainFrame.add(this.dayLabel);
		this.mainFrame.add(this.nextDayButton);
		this.mainFrame.setVisible(true);
	}

	@Override
	public void update(Observable model, Object change) {
		if(change instanceof Calendar) {
			// Change day to new day value
			this.dayLabel.setText(Integer.toString( (((Calendar) change).getDay()) ) );
		}
	}
	
	public void addController(FootballManagerController controller){
		this.nextDayButton.addActionListener(controller);
	}

}
