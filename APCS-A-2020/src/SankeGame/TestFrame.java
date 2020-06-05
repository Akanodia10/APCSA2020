package SankeGame;

import java.awt.CardLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TestFrame extends JFrame implements KeyListener{
	
	
	private HomePanel homePanel;
	private Board board;
	
	private Game controller;
	private JPanel panelCards;
	
	private static boolean Leftdir;
	private static boolean Rightdir;
	private static boolean Updir;
	private static boolean Downdir;
	
	

	
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
		this.setSize(600, 600);
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
		panelCards.add(new Board(), "GAME");
		((CardLayout)panelCards.getLayout()).show(panelCards , "GAME");
	}
	
	public static boolean getLeftdir() {
	    return Leftdir;	
	}
	
	public static boolean getRightdir() {
		return Rightdir;
	}
	
	public static boolean getUpdir() {
		return Updir;
	}
	
	public static boolean getDowndir() {
		return Downdir;
	}
	
	
	
	
	public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();
        System.out.println(key);

        if ((key == KeyEvent.VK_LEFT) && (!Rightdir)) {
            Leftdir = true;
            Updir = false;
            Downdir = false;
        }

        if ((key == KeyEvent.VK_RIGHT) && (!Leftdir)) {
            Rightdir = true;
            Updir = false;
            Downdir = false;
        }

        if ((key == KeyEvent.VK_UP) && (!Downdir)) {
            Updir = true;
            Rightdir = false;
            Leftdir = false;
        }

        if ((key == KeyEvent.VK_DOWN) && (!Updir)) {
            Downdir = true;
            Rightdir = false;
            Leftdir = false;
        }
    }

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
