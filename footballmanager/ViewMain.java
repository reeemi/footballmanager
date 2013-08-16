package footballmanager;

import java.awt.FlowLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

class ViewMain implements Observer, View {
	
	
	//------------------------------------VARIABLES-----------------------------------------//
	private static final int MAIN_FRAME_WIDTH = 500;
	private static final int MAIN_FRAME_HEIGHT = 500;
	
	
	private static final int MP_DAY_LABEL_WIDTH = 30;
	private static final int MP_DAY_LABEL_HEIGHT = 40;
	
	private static final int MP_NEXT_DAY_BUTTON_WIDTH = 30;
	private static final int MP_NEXT_DAY_BUTTON_HEIGHT = 40;
	
	private static final int MP_EVENT_COMBO_BOX_WIDTH = 50;
	private static final int MP_EVENT_COMBO_BOX_HEIGHT = 30;
	
	private static final int MP_SCHEDULED_DATE_SPINNER_WIDTH = 50;
	private static final int MP_SCHEDULED_DATE_SPINNER_HEIGHT = 30;
	
	private JFrame mainFrame;
	
	private JPanel mainPanel;
	private JLabel mp_dayLabel;
	private JButton mp_nextDayButton;
	private JComboBox mp_eventComboBox;
	private JSpinner mp_scheduledDateSpinner;

	//----------------------------------GETTERS/SETTERS-------------------------------------//
	protected JButton getMp_nextDayButton() {
		return this.mp_nextDayButton;
	}

	protected JComboBox getMp_eventComboBox(){
		return this.mp_eventComboBox;
	}
	
	protected JSpinner getMp_scheduledDateSpinner() {
		return mp_scheduledDateSpinner;
	}
	
	
	//------------------------------------CONSTRUCTOR--------------------------------------//
		protected ViewMain(){
			this.initialize();
			this.initializeMainPanel();
		}
	
	
	//-----------------------------------METHODS-------------------------------------------//
	protected void initialize(){
		this.mainFrame = new JFrame();
		this.mainFrame.setSize(MAIN_FRAME_WIDTH, MAIN_FRAME_HEIGHT);
		this.mainFrame.setLayout(new FlowLayout());
		this.mainFrame.setVisible(true);
	}
		
		
	protected void initializeMainPanel() {
		this.mainPanel = new JPanel();
		
		this.mp_dayLabel = new JLabel();
		this.mp_dayLabel.setSize(MP_DAY_LABEL_WIDTH, MP_DAY_LABEL_HEIGHT);
		this.mp_dayLabel.setVisible(true);
		
		this.mp_nextDayButton = new JButton();
		this.mp_nextDayButton.setSize(MP_NEXT_DAY_BUTTON_WIDTH, MP_NEXT_DAY_BUTTON_HEIGHT);
		this.mp_nextDayButton.setVisible(true);
		this.mp_nextDayButton.setText("Next day");
		
		this.mp_eventComboBox = new JComboBox();
		this.mp_eventComboBox.setSize(MP_EVENT_COMBO_BOX_WIDTH, MP_EVENT_COMBO_BOX_HEIGHT);
		this.mp_eventComboBox.addItem("Training");
		this.mp_eventComboBox.setVisible(true);
		
		this.mp_scheduledDateSpinner = new JSpinner(new SpinnerNumberModel(0,0,Integer.MAX_VALUE, 1));
		this.mp_scheduledDateSpinner.setSize(MP_SCHEDULED_DATE_SPINNER_WIDTH, MP_SCHEDULED_DATE_SPINNER_HEIGHT);
		this.mp_scheduledDateSpinner.setVisible(true);
		
		this.mainPanel.add(this.mp_dayLabel);
		this.mainPanel.add(this.mp_nextDayButton);
		this.mainPanel.add(this.mp_eventComboBox);
		this.mainPanel.add(this.mp_scheduledDateSpinner);
		
		this.mainFrame.add(this.mainPanel);
	}


	@Override
	public void update(Observable model, Object change) {
		if(change instanceof Calendar) {
			// Change day to new day value
			this.mp_dayLabel.setText(Integer.toString( (((Calendar) change).getDay()) ) );
		}
	}
	
	@Override
	public void addController(ControllerMain controller){
		this.mp_nextDayButton.addActionListener(controller);
		this.mp_eventComboBox.addActionListener(controller);
	}

}
