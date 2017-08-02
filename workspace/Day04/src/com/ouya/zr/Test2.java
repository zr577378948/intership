package com.ouya.zr;

import java.util.Scanner;

/**
 * 对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。

 */
public class Test2 {

	public static void main(String[] args) {
		while(true){
			System.out.println("请输入成绩");
		Scanner s = new Scanner(System.in);
		int score = s.nextInt();
		switch(score/10){
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("合格");
		break;
		
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("不合格");
		break;
			
		}

	}

	}

}
