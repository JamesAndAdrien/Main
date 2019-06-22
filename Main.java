import graphics.Window;
import gameloop.GameLoop;

public class Main {
    public static final int WIDTH = 1200;
	
	public static final int HEIGHT = 600;
	
	public static final String TITLE = "Game!";

    public static void main(String[] args) {
        System.out.println("Main");

        Window.createWindow(WIDTH, HEIGHT, TITLE);
		
		GameLoop game = new GameLoop();
		
		game.start();
    }
}