package com.ouya.zr;

import java.util.Scanner;

/**
 * 编写程序二：从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序。

 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		
		int zheng = 0;		
		int fu = 0;
	System.out.println("请输入你的整数：");
		for(int i = 0; ;i++ ){
			int num = s.nextInt();
			if(num>0){
				zheng++;
			}else if(num<0){
				fu++;
			}else
				break;
			}
			
		System.out.println("正数有"+zheng+"个");
		System.out.println("负数有"+fu+"个");
	}

}
