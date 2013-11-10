package com.arcanoid;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Ball {
	private int xPosition;
	private int yPosition;
	private int radius;
	private int xVelocity = -1;
	private int yVelocity = 1;

	public Ball(int xPosition, int yPosition, int radius) {
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.radius = radius;
		

	}

	public void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillOval(xPosition - radius, yPosition - radius, radius * 2,
				radius * 2);
	}



	public void tick() {
		xPosition += xVelocity;
		yPosition += yVelocity;
	}
	
	public int getxVelocity(){
		return xVelocity;
	}
	public int getyVelocity(){
		return yVelocity;
	}
	public int setxVelocity(){
		return xVelocity;
	}
	public int setyVelocity(){
		return yVelocity;
		}
	public int getxPosition(){
		return xPosition;
	}
	public int getyPosition(){
		return yPosition;
	}
	
	public void invertXVelocity() {
		xVelocity *= -1;
	}
	public int getRadius(){
		return radius;
	}
	

}
