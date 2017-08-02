package com.ouya.zr;

import java.util.Scanner;

/**
 * 编写程序：由键盘输入三个整数分别存入变量num1、num2、num3，对它们进行排序(使用 if-else if-else),并且从小到大输出。
 * @author Administrator
 *
 */
public class Test2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		
		if(num1>num2&&num1>num3){
			if(num2>num3){
				System.out.println(num3+"<"+num2+"<"+num1);
			}else{
				System.out.println(num2+"<"+num3+"<"+num1);
			}
		}else if(num2>num1&&num2>num3){
			if(num1>num3){
				System.out.println(num3+"<"+num1+"<"+num2);
			}else{
				System.out.println(num1+"<"+num3+"<"+num2);
			}
		}if(num3>num2&&num3>num1){
			if(num2>num1){
				System.out.println(num1+"<"+num2+"<"+num3);
			}else{
				System.out.println(num3+"<"+num2+"<"+num1);
			}
		}
		
	}

}
