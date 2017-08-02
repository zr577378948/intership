package com.ouya.zr;
/**
 * 求三个数中的最大值
 * @author Administrator
 *
 */
public class sanmu {

	public static void main(String[] args) {
		
/*
		int i = 10;
		int j = 11;
		int k = 15;
		
		int max = (i>j)?i:j;
		int max1 = (max>k)?max:k;
		System.out.println(max1);*/
		
		int q = 60;
		int w = q&15;//十进制12
		String ss = (w<=9)?w+"":(char)(w-10+'a')+""; //后四位
		int j = q>>4;//前四位
		String a = j+""+ss;
		System.out.println(a);
		
		
	}

}
