package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Point2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	
	private int posx1 = 1;
	private GameLogic logic;
	private ArrayList<Point2D> points = null;
	
	
	public GamePanel() {
		logic = new GameLogic(60.0, 45.0, 0.0, 10);
		this.points = new ArrayList<Point2D>();
	}
	
	public void run() {
		this.points.add(logic.getPoint());
		repaint();
	}
	
	public void paintComponent(Graphics g) {
		//Clearing screen
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, getWidth(), getHeight());
		//End screen clearing
		
		//----Painting for here:
		g.setColor(Color.BLACK);
		g.fillRect(30 , 10, 20, 20);
		//System.out.println(points.get(points.size()-1));
		
		Point2D point = points.get(points.size() - 1);
		g.setColor(Color.RED);
		g.drawOval((int) point.getX(),getHeight() - ((int) point.getY()), 10, 10);

		//Dispose
		g.dispose();
	}

}
