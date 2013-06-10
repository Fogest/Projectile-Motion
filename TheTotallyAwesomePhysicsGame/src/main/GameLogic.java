package main;

import java.awt.geom.Point2D;

public class GameLogic {
	
	private double time, deltaTime, x, y, speed, angle, ay, ax;
	
	public GameLogic(double speed, double angle, double accerlationX, double startHeight) {
		this.time = 0.0;
		this.deltaTime = .0001;
		this.x = 1.0;
		this.y = startHeight;
		this.speed = speed;
		this.ay = -9.8;
		this.angle = angle;
		this.ax = accerlationX;
		
	}
	
	public Point2D getPoint() {
		final double degreeToRadianConv = 3.14 / 180.0;
		this.time = this.time + deltaTime;
		
		// Vertical : Speed * Sine * Angle
		double vy = (this.speed * Math.sin(this.angle * degreeToRadianConv)) + this.ay*this.time ;
		// Horizontal : Speed * Cosine * Angle
		double vx = (this.speed * Math.cos(this.angle * degreeToRadianConv)) + this.ax*this.time;
		
        this.x = this.x + vx*this.time;
        this.y = this.y + vy*this.time + this.ay*(this.time*this.time); 
		
        vx += this.ax * this.time;
        vy += this.ay * this.time;
        
        
        
        Point2D p = new Point2D.Double(x,y);
		
		return p; 
	}
	public static void main(String[] args) {
		GameLogic logic = new GameLogic(60.0, 45.0, 0.0, 10);
		while(true)
			System.out.println(logic.getPoint().getX() + " " + logic.getPoint().getY());
	}

}
