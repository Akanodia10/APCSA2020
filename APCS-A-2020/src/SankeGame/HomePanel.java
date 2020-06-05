package SankeGame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;


public class HomePanel extends JPanel{
	private Game controller;
	private JButton playButton;


	public HomePanel(Game game) {
		super();
		this.controller=game;
		playButton = new JButton("PLAY"); 
		
		
		addComponents();
		setActionListeners();
		
	}
	
	public void addComponents() {
		this.add(playButton);
	}
	
	public void setActionListeners(){
		playButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent mouseClick)
			{
				controller.play();
			}
		});
	}
	
	
}
