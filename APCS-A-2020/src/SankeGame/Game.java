package SankeGame;

public class Game{
	private TestFrame window;
	
	public Game() {
		window = new TestFrame(this);
	}

	public void play() {		
		window.gameScreen();
	}
	
	public void stop() {
		window.startScreen();
	}

}

