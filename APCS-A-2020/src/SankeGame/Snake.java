package SankeGame;

import java.awt.CardLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Snake extends JFrame {

    public Snake() {
        
        initUI();
    }
    
    private void initUI() {
        add(new Board());
		
		
        setResizable(false);
        pack();
        
        setTitle("The Snake Game: By Arnav Kanodia");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.setVisible(true);
        });
    }
}
