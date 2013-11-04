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

	public void checkCollision(List<Block> blocks, Carret carret) {
		Iterator<Block> blockIterator = blocks.iterator();
		while (blockIterator.hasNext()) {
			Block block = blockIterator.next();
			if (xPosition >= block.getXPosition()
					&& xPosition <= (block.getXPosition() + block.getWidth())) {
				if (yPosition >= block.getYPosition()
						&& yPosition <= (block.getYPosition() + block
								.getHeight())) {
					if (xPosition == block.getXPosition() + block.getWidth()
							|| xPosition == block.getXPosition()) {
						xVelocity *= -1;
					} else {
						yVelocity *= -1;
					}
					blockIterator.remove();
				}
			}

		}

		if (xPosition > carret.getCarretPositionX()
				&& xPosition < carret.getCarretPositionX()
						+ carret.getcarretWidth() && yPosition - radius == 430) {
			yVelocity *= -1;
		}

		if (xPosition - radius < 0 || xPosition > 630) {
			xVelocity *= -1;
		}
		if (yPosition < 20) {
			yVelocity *= -1;
		}

		if (yPosition > 450) {
			System.out.println("Game over");

			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.exit(1);
		}

	}

	public void tick() {
		xPosition += xVelocity;
		yPosition += yVelocity;
	}

}
