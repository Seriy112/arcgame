package com.arcanoid;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JFrame;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Game extends JFrame {

	private JPanel panel;
	private List<Block> blocks;
	private Ball ball;
	private Carret carret;

	public static void main(String[] args) {
		Game game = new Game();
		game.setVisible(true);
		game.prepare();
		game.gameCycle();
	}

	private Game() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640, 500);
		panel = new JPanel() {
			public void paint(Graphics g) {

				g.setColor(Color.BLACK);
				g.fillRect(0, 0, 640, 500);
				g.setColor(Color.BLUE);
			
				
				carret.draw(g);
				
				ball.tick();
				ball.checkCollision(blocks, carret);
				
				for (Block block : blocks) {
					block.draw(g);
				}
				
				ball.draw(g);
				
			}
			
		};
		panel.setSize(640, 500);
		add(panel);
	//	setUndecorated(true);
		
		

	}
	
	private void gameCycle() {
		while (true) {
			long startTime = System.currentTimeMillis();
	
			Game.this.repaint();

			if (blocks.isEmpty()) {
				System.out.println("You WIN");

				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.exit(1);
			}
						
			long endTime = System.currentTimeMillis();
			long deltaTime = endTime - startTime;
			if (deltaTime < 10) {
				try {
					TimeUnit.MILLISECONDS.sleep(10 - deltaTime);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	private void prepare() {
		blocks = new LinkedList<Block>();
		int y = 20, j = 0;
		for (int i = 0; i < 3; i++) {
			for (int z = 0; z < 6; z++) {
				blocks.add(new Block(j, y, 100, 50));
				j += 105;
			}
			y += 55;
			j = 0;
		}
		
		ball = new Ball(200, 200, 10);
		carret = new Carret(0);
		
		addKeyListener(carret);
		
	}

}




