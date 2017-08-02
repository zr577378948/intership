package com.ouya.zr;

import java.util.Scanner;

/**
 * 编写水仙花数。例如153可以写成1*1*1+5*5*5+3*3*3,370可以写成3*3*3+7*7*7+0*0*0。
 * @author Administrator
 *
 */
public class ForTest4 {

	public static void main(String[] args) {
		
		int g = 0;
		int s = 0;
		int b = 0;
		
		for (int i=100;  i < 1000; i++) {
			
			g = i%10;
			s = (i/10)%10;
			b = i/100;
			
			if(i ==(int)(Math.pow(g, 3)) +(int)Math.pow(s, 3)+(int)Math.pow(b, 3)){
				System.out.println(i);
			}
		}
		
	}

}
