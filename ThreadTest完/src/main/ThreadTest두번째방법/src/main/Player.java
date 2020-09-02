package main;

import java.util.ArrayList;
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
	
	public void attack(ArrayList<Player> playerArr) {
		Random rd = new Random();
		int temp = rd.nextInt(11)+att;
		for (int i = 0; i < playerArr.size(); i++) {
			Player tempP = playerArr.get(i);
			if(!tempP.name.equals(name)) {
				tempP.life -= temp;
			}
		}
	}
	
	public void lifeUp() {
		life += 2;
	}
	
}
