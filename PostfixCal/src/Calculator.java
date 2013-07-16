import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calculator implements ActionListener{
	private final int NUM_BUTTON=10;
	private JTextField textDisplay;
	private JButton [] button;
	private JButton [] opButton;
	private JPanel pinpadPanel;
	private GridLayout pinpadLayout = new GridLayout(4,4);
	private String displayText ="";
	public Calculator() {
		opButton = new JButton[6];
		opButton[0] = new JButton("C");
		opButton[0].addActionListener(this);
		// implement more operators
		
		
		String [] list = {"+", "-", "x", "/"};
		Dimension dimText = new Dimension(100,100);
		JFrame theFrame = new JFrame();

		JPanel displayPanel = new JPanel();
		displayPanel.setBackground(Color.BLUE);
		pinpadPanel = new JPanel();
		pinpadPanel.setBackground(Color.CYAN);
		pinpadPanel.setLayout(pinpadLayout);

		generateButton();
		pinpadPanel.add(opButton[0]);
		// implement add other operators

		
		textDisplay = new JTextField();		
		textDisplay.setPreferredSize(dimText);
		JComboBox comboBox = new JComboBox(list);
		comboBox.setPreferredSize(dimText);
		pinpadPanel.add(comboBox);
		displayPanel.add(textDisplay);
		
		theFrame.add(textDisplay, BorderLayout.NORTH);		
		theFrame.add(pinpadPanel, BorderLayout.CENTER);
		
		//theFrame.add(mainPanel);
		theFrame.setVisible(true);
		theFrame.setSize(500, 500);
		
		
	}
	
	public void generateButton() {
		button = new JButton[NUM_BUTTON];
		for(int i=0; i<NUM_BUTTON; i++) {
			button[i] = new JButton(Integer.toString(i));
			button[i].addActionListener(this);
			pinpadPanel.add(button[i]);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch (e.getActionCommand()) {
		case "0":
			displayText +="0";
			textDisplay.setText(displayText);
			break;
		case "1":
			displayText +="1";
			textDisplay.setText(displayText);
			break;
		case "2":
			displayText +="2";
			textDisplay.setText(displayText);
			break;
		case "3":
			displayText +="3";
			textDisplay.setText(displayText);
			break;
		case "4":
			displayText +="5";
			textDisplay.setText(displayText);
			break;
		case "5":
			displayText +="5";
			textDisplay.setText(displayText);
			break;
		case "6":
			displayText +="6";
			textDisplay.setText(displayText);
			break;
		case "7":
			displayText +="7";
			textDisplay.setText(displayText);
			break;
		case "8":
			displayText +="8";
			textDisplay.setText(displayText);
			break;
		case "9":
			displayText +="9";
			textDisplay.setText(displayText);
			break;
		case "C":
			displayText ="";
			textDisplay.setText(displayText);
			break;


		default:
			break;
		}
	}
	
}
