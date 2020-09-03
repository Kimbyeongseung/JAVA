package main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.Random;

import model.Ball;

public class MyCanvas extends Canvas {
	ArrayList<Ball> ballArr = new ArrayList<Ball>();
//	Ball ball;

	MyThread th = null;

	public MyCanvas() {
//		ball = new Ball(100, 100, 3, 3, 50, Color.white);
		th = new MyThread();
		th.start();
	}

	public void addBall() {
		Random rd = new Random();
		ballArr.add(new Ball(rd.nextInt(300)+100, 
				rd.nextInt(200)+50, rd.nextInt(7)+2, rd.nextInt(7)+2, 
				(rd.nextInt(5)+1)*10, Color.white));
	}

	Image bufferImage;
	Graphics buffg;

	@Override
	public void paint(Graphics g) {
		if (buffg == null) {
			bufferImage = createImage(getWidth(), getHeight());
			if (bufferImage == null)
				System.out.println("생성 실패");
			else
				buffg = bufferImage.getGraphics();
		}
	}

	@Override
	public void update(Graphics g) {
		buffg.drawImage(bufferImage, 0, 0, this); // 버퍼 세팅

		/** 배경을 그려서 이전 화면을 덮음 **/
		buffg.setColor(Color.blue);
		buffg.fillRect(0, 0, getWidth(), getHeight());

		for (int i = 0; i < ballArr.size(); i++) {
			Ball ball = ballArr.get(i);
			buffg.setColor(ball.getColor());
			buffg.fillOval(ball.getPosX(), ball.getPosY(), ball.getSize(), ball.getSize());
		}

		g.drawImage(bufferImage, 0, 0, this); // 버퍼에 있는 것 그려주기
	}

//	int speedX = 5;
//	int speedY = 5;
//	int posX = 200;
//	int posY = 120;
	class MyThread extends Thread {
		@Override
		public void run() {
			while (true) {
				for (int i = 0; i < ballArr.size(); i++) {
					Ball ball = ballArr.get(i);
					ball.move();
//					ball.setPosX(ball.getPosX()+ball.getSpeedX());
//					ball.setPosY(ball.getPosY()+ball.getSpeedY());

					if (ball.getPosX() > getWidth() - ball.getSize() || ball.getPosX() < 0) {
						ball.setSpeedX(ball.getSpeedX() * -1);
					}
					if (ball.getPosY() > getHeight() - ball.getSize() || ball.getPosY() < 0) {
						ball.setSpeedY(ball.getSpeedY() * -1);
					}
				}
				repaint();

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}

}
