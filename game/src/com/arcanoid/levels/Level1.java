package com.arcanoid.levels;

import java.util.LinkedList;
import java.util.List;

import com.arcanoid.Ball;
import com.arcanoid.Block;
import com.arcanoid.Carret;
import com.arcanoid.Status;

public class Level1 extends BaseLevel {
	
	private final static int BLOCK_HEIGHT = 30;
	private final static int BLOCK_WIGTH = 70;
	private final static int SPACE = 5;
	
	private List<Block> blocks;
	private int nBlockHeight;
	private int nBlockWidth;
	private int xPosition;
	private int yPosition;
	
	private Ball ball;
	private Carret carret;
	
	public Level1() {
		blocks = new LinkedList<Block>();
		int startXPositson = xPosition;
		for (int i = 0; i < nBlockHeight; i++) {
			for (int z = 0; z < nBlockWidth; z++) {
				blocks.add(new Block(xPosition, yPosition, BLOCK_WIGTH, BLOCK_HEIGHT));
				xPosition += BLOCK_WIGTH + SPACE;
			}
			yPosition += BLOCK_HEIGHT + SPACE;
			xPosition = startXPositson;
		}
	}

	@Override
	public Status processLevel() {
		return Status.NONE;
		
	}
	
	

}
