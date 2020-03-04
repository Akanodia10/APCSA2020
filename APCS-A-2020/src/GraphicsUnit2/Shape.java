package GraphicsUnit2;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Arnav Kanodia
//Date -3/4/20
//Class - Period 2
//Lab  -

import java.awt.Color; 
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;
	private int xSpeed;
	private int ySpeed;

   /*
    *The constructor is used to initialize all instance variables.
    *The constructor makes the object.
    */
   public Shape(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
		xPos = x;
		yPos = y;
		width=wid;
		height= ht;
		color=col;
		xSpeed=xSpd;
		ySpeed=ySpd;
		//finish this constructor
   }

      /*
    *The draw method draws the shape on the screen.
    */
   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(xPos, yPos, width, height);
      window.setColor(Color.green);
      window .fillOval(xPos-15, yPos-15, width-20, height-20);
      window .fillOval(xPos+35, yPos-15, width-20, height-20);

   }

   /*
    *This draw method will be used to erase the shape.
    */
   public void draw(Graphics window, Color col)
   {
      window.setColor(col);
      window.fillRect(xPos, yPos, width, height);
     
   }

   public void moveAndDraw(Graphics window)
   {
	   window.setColor(color);
	   window.fillRect(xPos,yPos,width,height);
    	xPos += xSpeed;
    	yPos += ySpeed;   }

   //add in set and get methods for xPos, yPos, xSpeed, and ySpeed
   public int getX()
   {
   	return xPos;
   }

   public void setX( int x )
   {
	   xPos=x;
   }
   public int getY()
   {
   	return yPos;
   }

   public void setY( int y )
   {
	   xPos=y;
   }
   public int getSpeedx()
   {
   	return xSpeed;
   }

   public void setSpeedx( int xSpd )
   {
	   xSpeed=xSpd;
   }
   public int getSpeedy()
   {
   	return ySpeed;
   }

   public void setSpeedy( int ySpd )
   {
	   ySpeed=ySpd;
   }

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color+" "+xSpeed+" "+ySpeed;
   }
}