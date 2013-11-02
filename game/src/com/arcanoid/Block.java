package com.arcanoid;

import java.awt.Color;
import java.awt.Graphics;

public class Block {
	
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
		g.setColor(Color.BLUE);
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
	

}
