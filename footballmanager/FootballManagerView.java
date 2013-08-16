package footballmanager;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class FootballManagerView implements Observer {

	private static final int MAIN_FRAME_WIDTH = 500;
	private static final int MAIN_FRAME_HEIGHT = 500;
	
	private static final int DAY_LABEL_WIDTH = 30;
	private static final int DAY_LABEL_HEIGHT = 40;
	
	private static final int NEXT_DAY_BUTTON_WIDTH = 30;
	private static final int NEXT_DAY_BUTTON_HEIGHT = 40;
	
	
	JFrame mainFrame;
	JLabel dayLabel;
	JButton nextDayButton;

	protected void initialize() {
		this.mainFrame = new JFrame();
		this.mainFrame.setSize(MAIN_FRAME_WIDTH, MAIN_FRAME_HEIGHT);
		
		this.dayLabel = new JLabel();
		this.dayLabel.setSize(DAY_LABEL_WIDTH, DAY_LABEL_HEIGHT);
		this.dayLabel.setVisible(true);
		this.dayLabel.setText("-1");
		
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
		System.out.println("Notified.");
	}

}
