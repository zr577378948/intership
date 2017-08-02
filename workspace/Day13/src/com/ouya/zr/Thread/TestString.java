package com.ouya.zr.Thread;

import org.junit.Test;

public class TestString {

	/**
	 * 字符串与字节数组的转换
	 * 字符串转字节数组：方法：通常用getBytes();
	 * 字节数组转字符串：方法：调用字符串构造器
	 * 
	 * 
	 * 字符串与字符数组转换
	 * 字符串转字符数组：方法：调用字符串toCharArray();
	 * 字符数组转字符串：方法：调用字符串构造器
	 * 
	 */
	@Test
	public void test(){
//		字符串与字节数组转换
		String str = "asfdsssda";
		byte[] b = str.getBytes();
		for(int i=0;i<b.length;i++){
			System.out.print((char)b[i]+" ");
		}
		
		String str1 = new String(b);
		System.out.println(str1);
		
		
		String str2 = "fgdsgdsfgdfsg还是";
		char[] cs  = str2.toCharArray();
		for(int i=0;i<cs.length;i++){
			System.out.print((char)cs[i]+" ");
		}
		
		String str3 = new String(cs);
		System.out.println(str3);
		
	}
}

