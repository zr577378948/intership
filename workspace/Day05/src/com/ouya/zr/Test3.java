package com.ouya.zr;
/**
 *  *
	**
	***
	****Êä³ö´ËÍ¼ĞÎ
 * @author Administrator
 *
 */

public class Test3 {

	public static void main(String[] args) {

		for(int i = 0;i<4;i++){
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0;i<5;i++){
			for (int j = 6; j > i+1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
