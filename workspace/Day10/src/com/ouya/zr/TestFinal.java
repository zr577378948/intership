/*package com.ouya.zr;
*//**
 * 修饰类、属性、方法
 * 1.修饰类不能被继承
 * 例如:String类、StringBuffer类、System类
 * 2.final修饰方法为最终的、不能被重写。如：Object类的getClass() 
 * 3.final修饰属性，此属性就是一个常量,一旦初始化后，不能再被赋值。习惯上，常量用大写字符表示。
 * 此常量在哪里赋值，1.此常量不能使用默认初始化2.可以显式的赋值、代码块、构造器
 * 
 * 变量用static修饰：全局常量
 * 
 * >与final finalize()区分开
 * @author Administrator
 *
 *//*
public class TestFinal {
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.getClass());
		System.out.println(Math.PI);
	}

}

//常量
final class A11 {
	final int I  = 12 ;
	final double PI;
	final String name;
	final int J;
	//方法中不可以赋值
	public void m1(){
		System.out.println(I);
		//I=10;
		//J = 10;
	}
	{
		PI = 3.14;
	}
	public A11(){
		name = "dsf";
		
	}
	
	public A11(String n){
		name = n;
		
	}
}

class C{ 
	public final  void method1(){
		System.out.println("methode1");
	}
}


//不能被重写
class D extends C{
	public void method1(){
		System.out.println("methode1...");//...表示重写
	}
}*/