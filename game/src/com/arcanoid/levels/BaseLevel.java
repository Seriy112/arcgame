package com.arcanoid.levels;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.arcanoid.Block;




public abstract class BaseLevel implements ILevel {
	
	
	
	public void checkCollision(List<Block> blocks) {
		
		
		Iterator<Block> blockIterator = blocks.iterator();
		while (blockIterator.hasNext()) {
			Block block = blockIterator.next();
			if (ball.getXPosition() >= block.getXPosition()
					&& ball.getXPosition() <= (block.getXPosition() + block.getWidth())) {
				if (ball.getyPosition() >= block.getYPosition()
						&& ball.getyPosition() <= (block.getYPosition() + block
								.getHeight())) {
					if (ball.getxPosition() == block.getXPosition() + block.getWidth()
							|| ball.getxPosition() == block.getXPosition()) {
						invertXVelocity();
					} else {
						invertYVelocity();
					}
					blockIterator.remove();
				}
			}

		}

		if (ball.getxPosition() > carret.getPositionX()
				&& ball.getxPosition() < carret.getPositionX()
						+ carret.getWidth() && ball.getyPosition() - ball.getRadius() == 430) {
			invertYVelocity();
		}

		if (ball.getxPosition() - ball.getRadius() < 0 || ball.getxPosition() > 630) {
			invertXVelocity();
		}
		if (ball.getxPosition() < 20) {
			invertYVelocity();
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



}
