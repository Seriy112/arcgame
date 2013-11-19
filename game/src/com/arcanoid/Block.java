package com.arcanoid;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import com.arcanoid.levels.ILevel;

public class Block implements ILevel {
	
	private int xPosition;
	private int yPosition;
	private int width;
	private int height;
	
	public Block(int xPosition, int yPosition, int width, int height) {
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.width = width;
		this.height = height;
	}
	
	public void draw(Graphics g) {
		int h,s,b;
		h=(int)(1 + Math.random() * 255);
		s=(int)(1 + Math.random() * 255);
		b=(int)(1 + Math.random() * 255);
		g.setColor(Color.getHSBColor(h, s, b));
		g.fillRect(xPosition, yPosition, width, height);
	}

	public int getXPosition() {
		return xPosition;
	}

	public int getYPosition() {
		return yPosition;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public Status processLevel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void invertXVelocity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void invertYVelocity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getRadius() {
		// TODO Auto-generated method stub
		return 0;
	}	
	

}
