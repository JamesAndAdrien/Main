package gameLoop;

import graphics.Window;

public class GameLoop {
	
	private boolean isRunning;
	
	public static final int WIDTH = 1200;
	
	public static final int HEIGHT = 600;
	
	public static final String TITLE = "Game!";
	
	public static final double FRAMERATE_CAP = 120.0;
	
	private Game game;
	
	public static void main(String[] args) {
		
		Window.createWindow(WIDTH, HEIGHT, TITLE);
		
		GameLoop game = new GameLoop();
		
		game.start();
		
	}
	
	public void Main() {
		
		isRunning = false;
		
		game = new Game();
		
	}
	
	public void start() {
		
		run();
		
	}
	
	public void stop() {
		
		isRunning = false;
		
		System.out.println("Game stopping...");
		
		cleanUp();
		
	}
	
	private void run() {
		
		isRunning = true;
		
		int frames = 0;
		
		long frameCounter = 0;
		
		final double frameTime = 1.0/FRAMERATE_CAP;
		
		long previousTime = SpaceTime.getTime();
		
		double updateTime = 0.0d;
		
		while (isRunning) {
			
			boolean render = false;
			
			long currentTime = SpaceTime.getTime();
			
			long elapsedTime = currentTime - previousTime;
			
			previousTime = currentTime;
			
			updateTime += elapsedTime/(double)SpaceTime.SECOND;
			
			frameCounter += elapsedTime;
			
			while (updateTime > frameTime) {
				
				render = true;
				
				updateTime -= frameTime;
				
				SpaceTime.setDeltaTime(frameTime);
				
				//game.input();
				
				//game.update();
				
				if (Window.isCloseRequested()) {
					
					stop();
					
				}
				
				if (frameCounter > SpaceTime.SECOND) {
					
					System.out.println("Frames: " + frames);
					
					frames = 0;
					
					frameCounter = 0;
					
				}
				
			}
			if (render) {
				
				//render();
				
				frames ++;
				
			}
			
			else {
				
				try {
					Thread.sleep(1);
				} 
				catch (InterruptedException e) {

					e.printStackTrace();
				
				}
				
			}
			
		}
		
	}
	
	private void render() {
		
		game.render();
		
		Window.render();
		
	}
	
	private void cleanUp() {
		
		Window.destroy();
		
		System.out.println("Window destroyed...");
		
		System.out.println("Exiting...");
		
		System.exit(0);
		
	}
	
}