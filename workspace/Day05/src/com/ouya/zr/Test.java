package com.ouya.zr;

import java.util.Scanner;

/**
 * ��д��������Ӽ��̶��������ȷ�������������ж϶���������͸����ĸ���������Ϊ0ʱ��������

 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		
		int zheng = 0;		
		int fu = 0;
	System.out.println("���������������");
		for(int i = 0; ;i++ ){
			int num = s.nextInt();
			if(num>0){
				zheng++;
			}else if(num<0){
				fu++;
			}else
				break;
			}
			
		System.out.println("������"+zheng+"��");
		System.out.println("������"+fu+"��");
	}

}
