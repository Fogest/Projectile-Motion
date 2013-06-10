package main;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class MainGame {
	private static final long serialVersionUID = 1L;
	public static final String NAME = "Physics Game";
	public static final int HEIGHT = 160;
	public static final int WIDTH = HEIGHT * 16 / 9;
	public static final int SCALE = 4;
	
	private long reportedFramerate;
	long framerate = 1000 / 60;
	// time the frame began
	long frameStart;
	// number of frames counted this second
	long frameCount = 0;
	// time elapsed during one frame
	long elapsedTime;
	// accumulates elapsed time over multiple frames
	long totalElapsedTime = 0;
	// the actual calculated framerate reported
	
	
	public MainGame() {
		run();
	}
	
	public void run() {
		JFrame frame = new JFrame(MainGame.NAME);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		GamePanel game = new GamePanel();
		
		frame.setSize(new Dimension ( WIDTH * SCALE, HEIGHT * SCALE ));
		
		frame.add(game, BorderLayout.CENTER);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		while(true) {
			frameStart = System.currentTimeMillis();
			game.run();
			
			// calculate the time it took to render the frame
			elapsedTime = System.currentTimeMillis() - frameStart;
			// sync the framerate
			try {
				// make sure framerate milliseconds have passed this frame
				if (elapsedTime < framerate) {
					Thread.sleep(framerate - elapsedTime);
				} else {
					// don't starve the garbage collector
					Thread.sleep(5);
				}
			} catch (InterruptedException e) {
				break;
			}
			++frameCount;
			totalElapsedTime += (System.currentTimeMillis() - frameStart);
			if (totalElapsedTime > 1000) {
				reportedFramerate = (long) ((double) frameCount
						/ (double) totalElapsedTime * 1000.0);
				// show the framerate in the applet status window
				//System.out.println("fps: " + reportedFramerate);
				// repaint();
				frameCount = 0;
				totalElapsedTime = 0;
				
				//System.out.println(reportedFramerate);
			}
		}
	}



	public static void main(String[] args) {
		new MainGame();
	}

}