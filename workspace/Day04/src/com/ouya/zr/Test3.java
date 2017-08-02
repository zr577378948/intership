package com.ouya.zr;

import java.util.Scanner;

/**
 * 根据用于指定月份，打印该月份所属的季节。
 * 3,4,5 春季 6,7,8 夏季  9,10,11 秋季 12, 1, 2 冬季
  * @author Administrator
 *
 */

public class Test3 {

	public static void main(String[] args) {

		System.out.println("请输入月份：");

		
		while(true){
			Scanner s = new Scanner(System.in);
			int jijie = s.nextInt();
			
			if(jijie<1||jijie>12){
				System.out.println("请输入1到12间的数字");
				
			}
			
			switch(jijie){
			case 3:
			case 4:
			case 5:
				System.out.println("春");
				break;
				
			case 6:
			case 7:
			case 8:
				System.out.println("夏");
				break;
			
			case 9:
			case 10:
			case 11:
				System.out.println("秋");
				break;
				
			case 12:
			case 1:
			case 2:
				System.out.println("冬");
				break;
			
			}
			}
	}

}
