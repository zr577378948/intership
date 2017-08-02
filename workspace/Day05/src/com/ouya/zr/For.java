package com.ouya.zr;
/**
 * 计算100以内偶数的和
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
		System.out.println("偶数个数为："+num);
		System.out.println("偶数和为："+sum);
		
	}

}
