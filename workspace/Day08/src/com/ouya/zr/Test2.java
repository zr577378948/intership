package com.ouya.zr;

/**
 * 编写程序，定义三个重载方法并调用。方法名为mOL。
三个方法分别接收一个int参数、两个int参数、一个字符串参数。分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
在主类的main ()方法中分别用参数区别调用三个方法。

 * @author Administrator
 *
 */
public class Test2 {
	public static void main(String[] args) {
		/*Ol o = new Ol();
		o.mOL(2);
		o.mOL(2, 4);
		o.mOL("hello");*/
		//匿名内部类
		show(new Ol());
		new Ol().mOL(1);
			
	}
	
	public static void show(Ol o){
		o.mOL(2);
		o.mOL("aaa");
	}

}
class Ol{
	public void mOL(int a){
		System.out.println(a*a);
	}
	
	public void mOL(int a,int b){
		System.out.println(a*b);
	}
	public void mOL(String a){
		System.out.println(a);
	}
}