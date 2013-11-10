package com.arcanoid.levels;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.arcanoid.Ball;
import com.arcanoid.Block;
import com.arcanoid.Carret;

public abstract class BaseLevel implements ILevel {
	
	
	
	public void checkCollision(List<Block> blocks, Carret carret,Ball ball) {
		
		
		Iterator<Block> blockIterator = blocks.iterator();
		while (blockIterator.hasNext()) {
			Block block = blockIterator.next();
			if (ball.getxPosition() >= block.getXPosition()
					&& ball.getxPosition() <= (block.getXPosition() + block.getWidth())) {
				if (ball.getyPosition() >= block.getYPosition()
						&& ball.getyPosition() <= (block.getYPosition() + block
								.getHeight())) {
					if (ball.getxPosition() == block.getXPosition() + block.getWidth()
							|| ball.getxPosition() == block.getXPosition()) {
						ball.invertXVelocity();
					} else {
						yVelocity *= -1;
					}
					blockIterator.remove();
				}
			}

		}

		if (ball.getxPosition() > carret.getPositionX()
				&& ball.getxPosition() < carret.getPositionX()
						+ carret.getWidth() && ball.getyPosition() - ball.getRadius() == 430) {
			yVelocity *= -1;
		}

		if (ball.getxPosition() - ball.getRadius() < 0 || ball.getxPosition() > 630) {
			xVelocity *= -1;
		}
		if (ball.getxPosition() < 20) {
			yVelocity *= -1;
		}

		if (ball.getyPosition() > 450) {
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

	public int getxVelocity() {
		return xVelocity();
	}

	public int getyVelocity() {
		return yVelocity;
	}

	public int getXPosition() {
		return xPosition;
	}

	public int getYPosition() {
		return yPosition;
	}

}
