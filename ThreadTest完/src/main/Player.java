package main;

import java.util.Random;

public class Player {
	int life;
	int att =10;
	String name;
	int type;
	public Player(int life, int att, String name) {		
		this.life = life;
		this.att = att;
		this.name = name;
	}
	
	public void attack(Player enemy) {
		Random rd = new Random();
		int temp = rd.nextInt(11)+att;
		enemy.life -= temp;
//		enemy.life =   enemy.life - temp;
	}
	
	public void lifeUp() {
		life += 2;
	}
	
}
