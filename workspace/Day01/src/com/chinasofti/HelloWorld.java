package com.chinasofti;

public class HelloWorld {

//一个类中 ，只有一个主类。和一个主方法（main方法）
	/*
	 * 多行注释
	 * */
	/*一个源文件只能有一个声明为public的类。同时要求为与文件名相同？*/
	
	/*
	 * 编程规范：
	 * 	1 包名 小写
	 * 	2类，接口名，首字母大写
	 * 	3变量名，方法名，第一个字符小写，如果多个单词组成，第一个单词小写，其他单词首字母大写
	 * 	4.常量 大写
	 * */
	/*
	 * 八中常见数据类型： 
	 * 			    1 byte     byte bb= 
	 * 				2 short
	 * 				3 int
	 * 				4 long
	 * 				5 char
	 * 				6 float (范围比double大)
	 * 				7 double(小数点位数比float多)
	 * 				8 boolean
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b=127;
		short a=22;
		int aa=32;
		char hehe='a';
		long l=23232l;
		float dd=44444.0f;
		double ss=2342.2525;
		boolean isTrue=false;
		if(isTrue){
			System.out.println(isTrue);
		}else{
			System.out.println(isTrue);
		}
		System.out.println("中软实训第一天");
	}

}
