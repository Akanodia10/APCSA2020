package Unit15;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Arnav Kanodia

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Canvas;

@SuppressWarnings("serial")
class BallTestTwo extends Canvas implements Runnable
{
	private Ball ball;

	public BallTestTwo()
	{
		setBackground(Color.WHITE);
		setVisible(true);

		//instantiate a new Ball
		ball = new Ball();

		//test the Ball thoroughly
		//ball = new Ball(50,50);   
		//ball = new Ball(100,350,10,10);   
		//ball = new Ball(200,90,10,10, Color.RED); 
		//ball = new Ball(100,100,30,50,Color.BLUE,5,6);
		ball = new Ball(300,10,10,10,Color.GREEN, 5,1); 

		//test all constructors


		new Thread(this).start();
	}
	
	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics window)
	{
		ball.moveAndDraw(window);

		if(!(ball.getX()>=10 && ball.getX()<=550))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}

		if(!(ball.getY()>=10 && ball.getY()<=450))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
	}
	
   @SuppressWarnings("static-access")
public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(19);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}