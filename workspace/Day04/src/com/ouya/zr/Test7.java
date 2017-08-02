package com.ouya.zr;

import java.util.Scanner;

/**
 * 从键盘分别输入年、月、日，判断这一天是当年的第几天
   注：判断一年是否是闰年的标准：
       1）可以被4整除，但不可被100整除
       2）可以被400整除 
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
			System.out.println("输入的日期为"+year+"年的第"+(total+day+1)+"天");}
		}else{
		System.out.println("输入的日期为"+year+"年的第"+(total+day)+"天");
		}
		
		}else{
			System.out.println("请输入正确的日期");
		}
		
	}

}