package Unit16;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Arnav Kanodia

import java.awt.Color;
import java.awt.Graphics;

import java.awt.Font;
import javax.swing.JPanel;

import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class WinterScenePanel extends JPanel implements Runnable
{
	private List<AbstractShape> shapes;
	private AbstractShape sMan;
	private AbstractShape tree;

	public WinterScenePanel()
	{
		setVisible(true);
		shapes = new ArrayList<AbstractShape>();
		for (int i = 0; i < 50; i++) {
			int xpos = (int)((Math.random() * (730-40) +40));
			int ypos = (int)((Math.random() * (530-40) + 40));
			shapes.add(new FancySnowFlake(xpos,ypos,20,20, Color.white, 0, 5));
		}
		System.out.println(shapes.size());

		sMan = new SnowMan(300, 450, 100, 100);
		tree = new Tree(100,500,30,100, Color.green);

		

		new Thread(this).start();
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics window)
	{
		window.setColor(Color.BLUE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.WHITE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("MAKE A WINTER SCENE!",40,40);

		sMan.draw(window);
		tree.draw(window);
		for (AbstractShape s : shapes) {
			if (s.getYPos() > 530) {
				s.setYPos(40);
			}else {
				s.moveAndDraw(window);
			}
		}
	}

   @SuppressWarnings("static-access")
public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(35);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}