package com.ouya.zr;

import java.util.Scanner;

/**
 * 从键盘输入小明的期末成绩。
当成绩为100分时，奖励一辆BMW；
当成绩为（80，99)时，奖励一个台iphone8；
当成绩为[60,80]时，奖励一本参考书；
其它时，什么奖励也没有。
从键盘输入小明的期末成绩。
当成绩为100分时，奖励一辆BMW；
当成绩为（80，99)时，奖励一个台iphone8；
当成绩为[60,80]时，奖励一本参考书；
其它时，什么奖励也没有。

 * @author Administrator
 *
 */

public class Test1 {

	public static void main(String[] args) {
		System.out.println("请输入成绩：");
	
		Scanner s = new Scanner(System.in);
		int grade = s.nextInt();
		
		if(grade>=0&&grade<=100){
			if (grade==100) {
				System.out.println("奖励一辆BMW");
			} else if (80<grade&&grade<99) {
				System.out.println("奖励一个台iphone8");
			}else if (60<=grade&&grade<=80) {
				System.out.println("奖励一本参考书");
			}else {
				System.out.println("什么奖励也没有");
			}
		}
		
	}

}
