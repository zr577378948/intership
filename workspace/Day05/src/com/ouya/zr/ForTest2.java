package com.ouya.zr;
/**
 * 3000米的长绳，每天剪一半，多少天能小于5米？(不考虑小数)
 * @author Administrator
 *
 */
public class ForTest2 {

	public static void main(String[] args) {

		int day = 0;
		
		for (int i=3000;  i>= 5; day++) {
			i /= 2;
			
		}
		System.out.println(day+"天之后就小于5米");
		
	}

}
