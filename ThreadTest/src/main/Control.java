package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Control {
	ArrayList<Voca> vocaArr = new ArrayList<Voca>();
	
	public void init() {
		Player playerA = new Player(100, 10, "������");
		Player playerB = new Player(100, 10, "�Ҷ���");
		String input = "";
		Scanner scan  = new Scanner(System.in);
		vocaArr.add(new Voca("dog", "��"));
		vocaArr.add(new Voca("cat", "�����"));
		
		while(true) {
			int ranNum = new Random().nextInt(vocaArr.size());
			String question = vocaArr.get(ranNum).getKor();
			String answer = vocaArr.get(ranNum).getEng();
			System.out.println("����: "+question);			
			input = scan.nextLine();
			if(input.equals(answer)) {
				//����
			}else {
				//����
			}
			
		}
	}
}
