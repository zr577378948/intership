package com.ouya.zr;

import java.util.Scanner;

/**
 * �Ӽ��̷ֱ������ꡢ�¡��գ��ж���һ���ǵ���ĵڼ���
   ע���ж�һ���Ƿ�������ı�׼��
       1�����Ա�4�����������ɱ�100����
       2�����Ա�400���� 
 * @author Administrator
 *
 */

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		int mouth = s.nextInt();
		int day = s.nextInt();
		int total = 0;
		
		
		if(day>0&&day<32){
			
			
		switch(mouth-1){
		case 12 :
			total += 31;
		case 11:
			total += 28;
		case 10:
			total += 31;
		case 9:
			total += 30;
		case 8:
			total += 31;
		case 7:
			total += 30;
		case 6:
			total += 30;
		case 5:
			total += 31;
		case 4:
			total += 30;
		case 3:
			total += 31;
		case 2:
			total += 28;
		case 1:
			total += 31;
		case 0:
			total += 0;
		}
		if((year%4==0&&year%100!=0)||year%400==0){
			if(mouth>2){
			System.out.println("���������Ϊ"+year+"��ĵ�"+(total+day+1)+"��");}
		}else{
		System.out.println("���������Ϊ"+year+"��ĵ�"+(total+day)+"��");
		}
		
		}else{
			System.out.println("��������ȷ������");
		}
		
	}

}