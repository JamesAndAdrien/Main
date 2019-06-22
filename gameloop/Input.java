package gameloop;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Input implements KeyListener {
		
	private static ArrayList<Integer> currentKeys = new ArrayList<Integer>();
	
	private static ArrayList<Integer> justPressedKeys = new ArrayList<Integer>();
	
	private static ArrayList<Integer> justReleasedKeys = new ArrayList<Integer>();
	
	@Override
	public void keyTyped(KeyEvent e) {
		
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if(!justPressedKeys.contains(e.getKeyCode()) && !currentKeys.contains(e.getKeyCode())) {
			
			justPressedKeys.add(new Integer(e.getKeyCode()));
			
		}
		
		if (!currentKeys.contains(e.getKeyCode())) {
			
			currentKeys.add(new Integer (e.getKeyCode()));
			
		}
					
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		currentKeys.remove(new Integer (e.getKeyCode()));
		
	}
	
	public static boolean getKeyDown(int keyCode) {
		
		if (justPressedKeys.contains(keyCode)) {
			
			return true;
			
		}
		
		else {
			
			return false;
			
		}
		
	}
	
	public static boolean getKeyUp(int keyCode) {
		
		if (!currentKeys.contains(keyCode)) {
			
			return true;
			
		}
		
		else {
			
			return false;
			
		}
		
	}	
}
