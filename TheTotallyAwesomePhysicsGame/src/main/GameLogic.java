package main;

import java.awt.geom.Point2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class GameLogic {
  
	private double time, deltaTime, x, y, velocity, angle, ay, ax, vx, vy;

	public GameLogic(double velocity, double angle, double accerlationX, double startHeight, double gravity, double deltaTime) {
		this.setTime(0.0);
		this.deltaTime = deltaTime;
		this.x = 1.0;
		this.y = startHeight;
		this.velocity = velocity;
		this.ay = gravity;
		this.angle = angle;
		this.ax = accerlationX;
		this.vx = this.velocity*Math.cos(this.angle*(Math.PI/180.0));
		this.vy = this.velocity*Math.sin(this.angle*(Math.PI/180.0));
		 
	}
	
	public Point2D getPoint() {
	    setTime(getTime() + this.deltaTime);
	    this.x += this.vx*this.deltaTime;
	    this.y += this.vy*this.deltaTime;

	    this.vx += this.ax*this.deltaTime;
	    this.vy += this.ay*this.deltaTime;
	   
	    return new Point2D.Double(x,y); 
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}
	
	public double getDeltaTime() {
		return deltaTime;
	}

	public void setDeltaTime(double deltaTime) {
		this.deltaTime = deltaTime;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getVelocity() {
		return velocity;
	}

	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}

	public double getAngle() {
		return angle;
	}

	public void setAngle(double angle) {
		this.angle = angle;
	}

	public double getAy() {
		return ay;
	}

	public void setAy(double ay) {
		this.ay = ay;
	}

	public double getAx() {
		return ax;
	}

	public void setAx(double ax) {
		this.ax = ax;
	}

	public double getVx() {
		return vx;
	}

	public void setVx(double vx) {
		this.vx = vx;
	}

	public double getVy() {
		return vy;
	}

	public void setVy(double vy) {
		this.vy = vy;
	}

}