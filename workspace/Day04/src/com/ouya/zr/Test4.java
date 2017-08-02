package com.ouya.zr;

import java.util.Scanner;

/**
 * 编写程序：从键盘上输入2017年的“month”和“day”，要求通过程序输出输入的日期为2017年的第几天。
 * @author Administrator
 *
 */
public class Test4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
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
		
		System.out.println("输入的日期为2017年的第"+(total+day)+"天");
		
		}else{
			System.out.println("请输入正确的日期");
		}
	
	}

}
