package com.ouya.zr;

import java.util.Scanner;

/**
 * ��ѧ���ɼ�����60�ֵģ�������ϸ񡱡�����60�ֵģ���������ϸ񡱡�

 */
public class Test2 {

	public static void main(String[] args) {
		while(true){
			System.out.println("������ɼ�");
		Scanner s = new Scanner(System.in);
		int score = s.nextInt();
		switch(score/10){
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("�ϸ�");
		break;
		
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("���ϸ�");
		break;
			
		}

	}

	}

}
