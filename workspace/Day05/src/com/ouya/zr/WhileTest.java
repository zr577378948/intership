package com.ouya.zr;
/**
 * 计算100以内偶数的和
 * @author Administrator
 *
 */
public class WhileTest {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		int num = 0;
		while(i<100){
			if(i%2==0){
				sum +=i;
				num ++;
			}
			i++;
		}
		System.out.println("偶数个数为："+num);
		System.out.println("偶数和为："+sum);
		
	}

}
