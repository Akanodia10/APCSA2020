package Unit16;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Arnav Kanodia

import javax.swing.JFrame;


@SuppressWarnings("serial")
public class GraphicsRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner()
	{
		super("THE WINTER SCENE PROJECT");
		setSize(WIDTH,HEIGHT);

		getContentPane().add(new WinterScenePanel());

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		@SuppressWarnings("unused")
		GraphicsRunner run = new GraphicsRunner();
	}
}