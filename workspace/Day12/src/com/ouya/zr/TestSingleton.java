package com.ouya.zr;
//饿汉式
public class TestSingleton {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1==s2);//true
	}
}
class Singleton{
//	1.私有化构造器,使得在类的外部不能够调用此构造器
	private Singleton(){
		
	}
//	2.在类的内部创建一个类的实例
	private static Singleton instance = new Singleton();
//	3.私有化此对象，通过公共的方 法来调用
//	4.此公共的方法只能通过类来调用，因此设置为static
	public static Singleton getInstance(){
		return instance;
	}
}
