package com.ouya.zr;
/**
 * ����100����ż���ĺ�
 * @author Administrator
 *
 */

public class For {
	public static void main(String[] args) {
		
		int sum = 0;
		int num = 0;
		for (int i = 1; i < 100; i++) {
			if(i%2==0){
				sum += i;
				num++;
			}
		}
		System.out.println("ż������Ϊ��"+num);
		System.out.println("ż����Ϊ��"+sum);
		
	}

}
