package com.arcanoid.levels;

import java.awt.Graphics;
import java.awt.event.KeyEvent;


import com.arcanoid.Status;
public interface ILevel {
	
	Status processLevel();
	void draw(Graphics g);
	void tick();
	void invertXVelocity();
	void invertYVelocity();
	void keyPressed(KeyEvent e);
	int getXPosition();
	int getYPosition();
	int getRadius();
	int getWidth();
	int getHeight();
	
}

