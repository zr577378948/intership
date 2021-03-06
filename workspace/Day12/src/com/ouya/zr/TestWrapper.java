package com.ouya.zr;

import org.junit.Test;

public class TestWrapper {
	//基本数据类型与包装类之间的转换
	//基本数据类型--->包装类：调用包装类的构造器
	@Test
	public void test(){
		
		int i = 10;
		Integer i1 = new Integer(i); 
		System.out.println(i1);
		i1 = new Integer("12");
		System.out.println(i1);//12
		//包装类--->基本数据类型：
		int i2 = i1.intValue();
		
		Float f = new Float(12.3F);
		System.out.println(f);
		
		Boolean b = new Boolean(false);
		Boolean b1 = new Boolean("true");//true
		System.out.println(b);
		
		//对于Boolean类型,当形参是"true",返回true,其他都返回false。
		b1 = new Boolean("truesdrf");
		System.out.println(b1);
	}

}
