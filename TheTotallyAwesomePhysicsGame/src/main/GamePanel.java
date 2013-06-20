package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Point2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public class GamePanel extends JPanel {

	private int posx1 = 1;
	private GameLogic logic;
	private OptionsPanel options;
	private ArrayList<Point2D> points = null;
	private boolean finished = false;

	public GamePanel(OptionsPanel options) {
		this.options = options;
		this.points = new ArrayList<Point2D>();
		finished = false;
	}

	public void run() {
		if (logic == null)
			logic = options.logicWrapper();
		this.points.add(logic.getPoint());
		repaint();
	}
	public void reset() {
		this.points.clear();
		logic = null;
	}

	public void paintComponent(Graphics g) {
		if (options.isStartGame() == true) {
			// Clearing screen
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, getWidth(), getHeight());
			// End screen clearing

			// ----Painting for here:

			Point2D point = points.get(points.size() - 1);
			
			if ((int) point.getY() < 0) {
				options.setStartGame(false);
			}
			g.setColor(Color.GRAY);
			for (Point2D p : points) {
				g.drawOval((int) p.getX(), getHeight() - ((int) p.getY()), 20, 20);
			}
			g.setColor(Color.RED);

			g.fillOval((int) point.getX(), getHeight() - ((int) point.getY()), 20, 20);
			
			g.setFont(new Font("Arial", Font.BOLD, 20));
			
			g.drawString("Speed of Y: " + (int) logic.getVy(), 20, 20);
			g.drawString("Speed of X: " + (int) logic.getVx(), 20, 40);
			
			g.drawString("Time: " + (int) logic.getTime(), 200, 20);



			// Dispose
			g.dispose();
		}
	}

}
