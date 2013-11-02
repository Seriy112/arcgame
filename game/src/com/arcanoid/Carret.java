package com.arcanoid;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Carret extends KeyAdapter {
	
	private int carretPositionX;

	public Carret(int carretPositionX) {
		this.carretPositionX = carretPositionX;
	}

	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(carretPositionX, 450, 100, 25);

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

}
