package control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import model.Voca;

public class Control {
	String input = "";
	Scanner scan = new Scanner(System.in);
	ArrayList<Voca> vocaArr = new ArrayList<>();

	private void saveData() {
		FileWriter fw;
		try {
			fw = new FileWriter("c:/my/voca.txt"); // ����� , true �ٿ�����
			for (int i = 0; i < vocaArr.size(); i++) {
				String eng = vocaArr.get(i).getEng();
				String kor = vocaArr.get(i).getKor();
				String data = eng + "," + kor+"\r\n";
				fw.write(data);
			}
			fw.close();
			System.out.println("���� �Ϸ�");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void readData() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("c:/my/voca.txt"));
			while (true) {
				String line = br.readLine();
				if (line == null) // �о�� �����Ͱ� ����
					break;			
				String[] temp = line.split(",");
				vocaArr.add(new Voca(temp[0], temp[1]));
			}
			br.close();
			System.out.println("�� "+vocaArr.size() +"�� �ܾ� �ε�");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void showVoca() {
		System.out.println("[ �� �ܾ��� " + vocaArr.size() + "�� ]");
		for (int i = 0; i < vocaArr.size(); i++) {
			System.out.println((i + 1) + ". " + vocaArr.get(i).getEng() + " : " + vocaArr.get(i).getKor());
		}
	}

	private void addVoca() {
		System.out.println();
		System.out.println("�߰��� �ܾ� �Է��ϼ�");
		input = scan.nextLine();
		System.out.println("�ѱ� ��?");
		String kor = scan.nextLine();
		vocaArr.add(new Voca(input, kor));
	}

	private void deleteVoca() {
		System.out.println();
		System.out.println("������ �ܾ ������ �ּ���");
		input = scan.nextLine();
		int temp = Integer.parseInt(input);
		vocaArr.remove(temp - 1);
	}

	private void updateVoca() {
		System.out.println();
		System.out.println("������ �ܾ ������ �ּ���");
		input = scan.nextLine();
		int temp = Integer.parseInt(input);
		System.out.println("������ �ܾ� �Է��ϼ�");
		input = scan.nextLine();
		vocaArr.get(temp - 1).setEng(input);
//		engArr.set(temp - 1, input);
		System.out.println("������ �ѱ۶� �Է��ϼ�");
		input = scan.nextLine();
		vocaArr.get(temp - 1).setKor(input);
//		korArr.set(temp - 1, input);
	}

	private void scrambleGame() {
		Random rd = new Random();
		int ranNum = rd.nextInt(vocaArr.size());
		String answer = vocaArr.get(ranNum).getEng();

		String question = "";

		ArrayList<String> tempArr = new ArrayList<String>();
		for (int i = 0; i < answer.length(); i++) {
			tempArr.add(answer.substring(i, i + 1));
		}

		while (tempArr.size() > 0) {
			ranNum = rd.nextInt(tempArr.size());
			question = question + tempArr.get(ranNum);
			tempArr.remove(ranNum);
		}

		String temp = answer;
//		while(temp.length() > 0) {
//			ranNum = rd.nextInt(temp.length());
//			question = question + temp.substring(ranNum, ranNum+1);
//			temp = temp.substring(0, ranNum) + temp.substring(ranNum+1);					
//			System.out.println("ranNum: "+ ranNum +",  question: "+question +", temp: "+ temp);
//		}
		System.out.println("����: " + question);
		input = scan.nextLine();
		if (input.equals(answer)) {
			// ����
		} else {
			// ����
		}
	}

	public void init() {
		//���Ϸε�
		File file = new File("c:/my/voca.txt");
		if(file.exists()) {
			readData();
		}
		
		while (true) {
			System.out.println("����: " + vocaArr.size());
			System.out.println("----------------------");
			System.out.println("|  ���ҷ�?");
			System.out.println("|  1. �߰�    2. ����    3. ����   4. ����   5. ������");
			System.out.println("----------------------");

			String input = scan.nextLine();

			if (input.equals("1")) {
				showVoca();
				addVoca();
				saveData();
			} else if (input.equals("2")) {
				showVoca();
				deleteVoca();
				saveData();
			} else if (input.equals("3")) {
				showVoca();
				updateVoca();
				saveData();
			} else if (input.equals("4")) {
				scrambleGame();

			} else if (input.equals("5")) {
				break;
			} else {
				System.out.println("���� ���� �� ġ��??");
			}
			showVoca();

			System.out.println();
			System.out.println();
		}
	}
}
