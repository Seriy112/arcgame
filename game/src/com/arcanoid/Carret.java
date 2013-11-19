package com.arcanoid;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import com.arcanoid.levels.ILevel;

public class Carret extends KeyAdapter implements ILevel {

	private int carretPositionX;
	private int carretWidth;
	private int carretHeight;

	public Carret(int carretPositionX) {
		this.carretPositionX = carretPositionX;
		this.carretWidth = 100;
	}

	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(carretPositionX, 450, carretWidth, 25);

	}

	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_RIGHT:
			if (carretPositionX == 540) {
				break;
			}
			carretPositionX += 10;

			break;
		case KeyEvent.VK_LEFT:
			if (carretPositionX == 0) {
				break;
			}
			carretPositionX -= 10;

			break;
		}
	}

	public int getXPosition() {
		return carretPositionX;
	}

	public int getWidth() {
		return carretWidth;
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
	public int getYPosition() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRadius() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

}
