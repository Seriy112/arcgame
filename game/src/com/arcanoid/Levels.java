package com.arcanoid;

import java.util.LinkedList;
import java.util.List;

public class Levels {
	private int xPosition;
	private int yPosition;
	private int width;
	private int height;
	private int nBlockWidth;
	private int nBlockHeight;
	private List<Block> blocks;
	private Ball ball;
	private Carret carret;

	public Levels(int xPosition, int yPosition, int width, int height,
			int nBlockWidth, int nBlockHeight) {
		this.width = width;
		this.height = height;
		this.width = width;
		this.height = height;
		this.nBlockWidth = nBlockWidth;
		this.nBlockHeight = nBlockHeight;
	}

	public void level2() {
		blocks = new LinkedList<Block>();

		for (int i = 0; i < nBlockHeight; i++) {
			for (int z = 0; z < nBlockWidth; z++) {
				blocks.add(new Block(xPosition, yPosition, width, height));
				xPosition += width + 5;
			}
			yPosition += height + 5;
			xPosition = 0;
		}

		ball = new Ball(200, 200, 10);
		carret = new Carret(0);

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
