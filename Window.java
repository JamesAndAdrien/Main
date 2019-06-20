package graphics;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Window extends JFrame {
	
		static JFrame frame = new JFrame();
		
		public static boolean isCloseRequested = false;

		private static Graphics g;
	
	public static void createWindow(int width, int height, String title) {
		
		frame.setSize(width, height);
		
		frame.setVisible(true);
		
		frame.setTitle(title);
		
		frame.setResizable(true);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		
		int w = frame.getSize().width;
		
		int h = frame.getSize().height;
		
		int x = (dim.width - w)/2;
		
		int y = (dim.height - h)/2;	
		
		frame.setLocation(x,y);
		
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				
				isCloseRequested = true;
				
				System.out.println("Close Requested");
				
				//System.exit(0);
				
			}
			
		});
		
	}
	
	public int getWidth() {
		
		return frame.getWidth();
		
	}
	
	public int getHeight() {
		
		return frame.getHeight();
		
	}
	
	public String getTitle() {
		
		return frame.getTitle();
		
	}
	
	public static void destroy() {
		
		frame.dispose();
		
	}
	
	public static void render() {
		
		//update display
		
		frame.update(g);
		
	}
	
	public static boolean isCloseRequested() {
		
		return isCloseRequested;
		
	}
	
}
