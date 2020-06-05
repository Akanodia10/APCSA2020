package SankeGame;

import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TestFrame extends JFrame{
	
	private HomePanel homePanel;
	//private GamePanel gamePanel;
	
	private Game controller;
	private JPanel panelCards;

	
	public TestFrame(Game controller) {
		super();
		this.panelCards = new JPanel(new CardLayout());
		this.controller = controller;
		this.homePanel = new HomePanel(controller);	
		loadFrame();
	}
		
	public void loadFrame() {
		panelCards.add(homePanel, "HOME");
		this.add(panelCards);
		panelCards.setVisible(true);
		this.setSize(1300, 800);
		this.setVisible(true);
		this.setResizable(false);
		this.setEnabled(true);
		((CardLayout)panelCards.getLayout()).show(panelCards , "HOME");
	}

	public HomePanel getHomePanel() {
		return homePanel;
	}
	
	public void startScreen() {
		panelCards.remove(1);
		((CardLayout)panelCards.getLayout()).show(panelCards , "HOME");
		
	}
	
	public void gameScreen() {
		panelCards.add(new GamePanel(controller, this), "GAME");
		panelCards.setEnabled(true);
		((CardLayout)panelCards.getLayout()).show(panelCards , "GAME");
	}
}
