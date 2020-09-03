package main;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Control {

	public void init() {
		Frame frame = new Frame("첫 번째 AWT");
		setLayout(frame);
		frame.setLayout(null);

		MyCanvas can = new MyCanvas();
		can.setSize(500, 400);
		can.setLocation(100, 70);
		can.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
//				System.out.println("R: "+e.getKeyCode());
			}

			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("P: " + e.getKeyCode());
				switch (e.getKeyCode()) {
				case 32:
					can.addBall();
					break;
				}
			}
		});

		frame.add(can);
		frame.setVisible(true); // 보여주기

	}

	private void setLayout(Frame frame) {
		int width = 700;
		int height = 500;
		Dimension scr = Toolkit.getDefaultToolkit().getScreenSize();
//		System.out.println(scr.width + " : "+scr.height); //모니터 해상도
		int posX = scr.width / 2 - (width / 2);
		int posY = scr.height / 2 - (height / 2);
		frame.setLocation(1920 + posX, posY); // 프레임 위치
		frame.setSize(width, height); // 프레임 크기
		frame.setResizable(false); // 프레임 크기 조정 가능여부

		frame.addWindowListener(new WindowListener() {
			@Override
			public void windowOpened(WindowEvent e) {
			}

			@Override
			public void windowIconified(WindowEvent e) {
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
			}

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

			@Override
			public void windowClosed(WindowEvent e) {

			}

			@Override
			public void windowActivated(WindowEvent e) {

			}
		});
	}
}
