package com.ouya.zr;

import java.util.Scanner;

/**
 * ��д�����ɼ����������������ֱ�������num1��num2��num3�������ǽ�������(ʹ�� if-else if-else),���Ҵ�С���������
 * @author Administrator
 *
 */
public class Test2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		
		if(num1>num2&&num1>num3){
			if(num2>num3){
				System.out.println(num3+"<"+num2+"<"+num1);
			}else{
				System.out.println(num2+"<"+num3+"<"+num1);
			}
		}else if(num2>num1&&num2>num3){
			if(num1>num3){
				System.out.println(num3+"<"+num1+"<"+num2);
			}else{
				System.out.println(num1+"<"+num3+"<"+num2);
			}
		}if(num3>num2&&num3>num1){
			if(num2>num1){
				System.out.println(num1+"<"+num2+"<"+num3);
			}else{
				System.out.println(num3+"<"+num2+"<"+num1);
			}
		}
		
	}

}
