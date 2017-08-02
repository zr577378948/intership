package com.ouya.zr;

import java.util.Scanner;

/**
 * 键盘读入学生成绩，找出最高分，并输出学生成绩等级
 * 成绩>=最高分-10  等级为'A'
 * 成绩>=最高分-20  等级为'B'
 * 成绩>=最高分-30  等级为'C'
 * 其余            		  等级为'D'
 * @author Administrator
 *
 */
public class ShuZuTest1 {



	public static void main(String[] args) {
		int max= 0;
		Scanner s = new Scanner(System.in);
		System.out.println("请输入学生人数：");
		int num = s.nextInt();
		System.out.println("请输入"+num+"个成绩");
		int []stu = new int[num];
		
		for(int i=0;i<stu.length;i++){
			int score = s.nextInt();
			stu[i] = score;
			if(stu[i]>max){
				max = stu[i];
			}
		}
		
		//最高成绩
		System.out.println("最高成绩为："+max);
		char leval;
		
		for (int i = 0; i < stu.length; i++) {
			if(stu[i]>=max-10){
				leval = 'A';
			}else if(stu[i]>=max-20){
				leval = 'B';
			}else if(stu[i]>=max-30){
				leval = 'C';
			}else{
				leval = 'D';
			}
			System.out.println("student "+ i +" score is "+stu[i]+",等级为 "+leval);
		}
		
		
	}
}
