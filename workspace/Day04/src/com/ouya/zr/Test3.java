package com.ouya.zr;

import java.util.Scanner;

/**
 * ��������ָ���·ݣ���ӡ���·������ļ��ڡ�
 * 3,4,5 ���� 6,7,8 �ļ�  9,10,11 �＾ 12, 1, 2 ����
  * @author Administrator
 *
 */

public class Test3 {

	public static void main(String[] args) {

		System.out.println("�������·ݣ�");

		
		while(true){
			Scanner s = new Scanner(System.in);
			int jijie = s.nextInt();
			
			if(jijie<1||jijie>12){
				System.out.println("������1��12�������");
				
			}
			
			switch(jijie){
			case 3:
			case 4:
			case 5:
				System.out.println("��");
				break;
				
			case 6:
			case 7:
			case 8:
				System.out.println("��");
				break;
			
			case 9:
			case 10:
			case 11:
				System.out.println("��");
				break;
				
			case 12:
			case 1:
			case 2:
				System.out.println("��");
				break;
			
			}
			}
	}

}
