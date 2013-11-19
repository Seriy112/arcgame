package com.arcanoid;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.arcanoid.levels.ILevel;

public class Ball implements ILevel{
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
	
	public void invertXVelocity() {
		xVelocity *= -1;
	}
	
	public void invertYVelocity() {
		yVelocity *= -1;
	}
	
	public int getXPosition(){
		return xPosition;
	}
	public int getYPosition(){
		return yPosition;
	}
	

	public int getRadius(){
		return radius;
	}

	@Override
	public Status processLevel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
