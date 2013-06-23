package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OptionsPanel extends JPanel implements ActionListener {
	private JLabel velocityLabel, angleLabel, accelerationLabel, initialHeightLabel, gravityLabel,deltaTimeLabel;
	private JTextField velocityField, angleField, accelerationField, initialHeightField, gravityField, deltaTimeField;
	private JButton start,stop;
	
	private boolean startGame = false;

	public OptionsPanel() {
		start = new JButton("Start");
		start.setActionCommand("Start");
		start.addActionListener(this);
		this.add(start);
		
		stop = new JButton("Stop");
		stop.setActionCommand("Stop");
		stop.addActionListener(this);
		this.add(stop);

		velocityLabel = new JLabel("Velocity");
		velocityField = new JTextField(4);
		velocityField.setText("60");
		this.add(velocityLabel);
		this.add(velocityField);

		angleLabel = new JLabel("Angle");
		angleField = new JTextField(4);
		angleField.setText("25");
		this.add(angleLabel);
		this.add(angleField);

		accelerationLabel = new JLabel("Horizontal Acceleration");
		accelerationField = new JTextField(4);
		accelerationField.setText("0");
		this.add(accelerationLabel);
		this.add(accelerationField);

		initialHeightLabel = new JLabel("Initial Height");
		initialHeightField = new JTextField(4);
		initialHeightField.setText("10");
		this.add(initialHeightLabel);
		this.add(initialHeightField);

		gravityLabel = new JLabel("Gravity");
		gravityField = new JTextField(4);
		gravityField.setText("-9.8");
		this.add(gravityLabel);
		this.add(gravityField);
		
		deltaTimeLabel = new JLabel("Delta Time");
		deltaTimeField = new JTextField(4);
		deltaTimeField.setText("0.05");
		this.add(deltaTimeLabel);
		this.add(deltaTimeField);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equals("Start")) {
			setStartGame(true);
		}
		if (command.equals("Stop")) {
			setStartGame(false);
		}
	}

	public GameLogic logicWrapper() {

		return new GameLogic(Double.parseDouble(velocityField.getText()), Double.parseDouble(angleField.getText()),
				Double.parseDouble(accelerationField.getText()), Double.parseDouble(initialHeightField.getText()),
				Double.parseDouble(gravityField.getText()), Double.parseDouble(deltaTimeField.getText()));

	}

	public boolean isStartGame() {
		return startGame;
	}

	public void setStartGame(boolean startGame) {
		this.startGame = startGame;
	}
}
