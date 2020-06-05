package SankeGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel{
	
	private Game controller;
	private TestFrame window;
	
	
	// for when this is referring to an action listener
	GamePanel a = this;

	public GamePanel(Game controller, TestFrame window) {
		super();
		this.controller = controller;
		this.window = window;
		this.setOpaque(false);
		
}

		
		//addActionListeners();
		//startGame();


	public void startGame() {
		//this.addComponents();
	}
}
