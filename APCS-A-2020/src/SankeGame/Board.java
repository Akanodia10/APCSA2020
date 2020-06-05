package SankeGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class Board extends JPanel implements ActionListener {

    private final int boardwidth = 600;
    private final int boardheight = 600;
    private final int dotsize = 10;
    private final int alldots = 900;
    private final int randompos = 29;
    private final int DELAY = 140;

    private final int x[] = new int[alldots];
    private final int y[] = new int[alldots];

    private int dots;
    private int xapple;
    private int yapple;

    private boolean leftdir = false;
    private boolean rightdir = true;
    private boolean updir = false;
    private boolean downdir = false;
    private boolean inGame = true;

    private Timer timer;
    private Image ball;
    private Image apple;
    private Image head;

    public Board() {
        
        createBoard();
    }
    
    private void createBoard() {

        addKeyListener(new TAdapter());
        setBackground(Color.black);
        setFocusable(true);

        setPreferredSize(new Dimension(boardwidth, boardheight));
        loadImages();
        startGame();
    }

    private void loadImages() {

        ImageIcon iid = new ImageIcon("src/SankeGame/dot.png");
        ball = iid.getImage();

        ImageIcon iia = new ImageIcon("src/SankeGame/apple.png");
        apple = iia.getImage();

        ImageIcon iih = new ImageIcon("src/SankeGame/head.png");
        head = iih.getImage();
    }

    private void startGame() {

        dots = 1;

        for (int z = 0; z < dots; z++) {
            x[z] = 50 - z * 10;
            y[z] = 50;
        }
        
        findApple();

        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);
    }
    
    private void doDrawing(Graphics g) {
        
        if (inGame) {

            g.drawImage(apple, xapple, yapple, this);

            for (int z = 0; z < dots; z++) {
                if (z == 0) {
                    g.drawImage(head, x[z], y[z], this);
                } else {
                    g.drawImage(ball, x[z], y[z], this);
                }
            }

            Toolkit.getDefaultToolkit().sync();

        } else {

            gameover(g);
        }        
    }

    private void gameover(Graphics g) {
        
        String msg = "Game Over: You Loose";
        Font small = new Font("Helvetica", Font.BOLD, 16);
        FontMetrics metr = getFontMetrics(small);

        g.setColor(Color.white);
        g.setFont(small);
        g.drawString(msg, (boardwidth - metr.stringWidth(msg)) / 2, boardheight / 2);
    }

    private void checkApple() {

        if ((x[0] == xapple) && (y[0] == yapple)) {

            dots++;
            findApple();
        }
    }

    private void move() {

        for (int z = dots; z > 0; z--) {
            x[z] = x[(z - 1)];
            y[z] = y[(z - 1)];
        }

        if (leftdir) {
            x[0] -= dotsize;
        }

        if (rightdir) {
            x[0] += dotsize;
        }

        if (updir) {
            y[0] -= dotsize;
        }

        if (downdir) {
            y[0] += dotsize;
        }
    }

    private void Collision() {

        for (int z = dots; z > 0; z--) {

            if ((z > 4) && (x[0] == x[z]) && (y[0] == y[z])) {
                inGame = false;
            }
        }

        if (y[0] >= boardheight) {
            inGame = false;
        }

        if (y[0] < 0) {
            inGame = false;
        }

        if (x[0] >= boardwidth) {
            inGame = false;
        }

        if (x[0] < 0) {
            inGame = false;
        }
        
        if (!inGame) {
            timer.stop();
        }
    }

    private void findApple() {

        int r = (int) (Math.random() * randompos);
        xapple = ((r * dotsize));

        r = (int) (Math.random() * randompos);
        yapple = ((r * dotsize));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (inGame) {

            checkApple();
            Collision();
            move();
        }

        repaint();
    }

    private class TAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {

            int key = e.getKeyCode();

            if ((key == KeyEvent.VK_LEFT) && (!rightdir)) {
                leftdir = true;
                updir = false;
                downdir = false;
            }

            if ((key == KeyEvent.VK_RIGHT) && (!leftdir)) {
                rightdir = true;
                updir = false;
                downdir = false;
            }

            if ((key == KeyEvent.VK_UP) && (!downdir)) {
                updir = true;
                rightdir = false;
                leftdir = false;
            }

            if ((key == KeyEvent.VK_DOWN) && (!updir)) {
                downdir = true;
                rightdir = false;
                leftdir = false;
            }
        }
    }
}