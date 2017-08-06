package com.ouya.zr;

public class Fun {

	public static void main(String[] args) {
		//方法传入String类型
		String string = getName("你好");
		System.out.println(string);
		
		//方法传对象
		Book books = getName(new Book("小王子",10));
		System.out.println(books);
		
		//传入基本数据类型
		System.out.println(getName('d'));
	}
	
	/*public static int getName(A a){
		return a;
	}*/
	
	
	/*泛型方法：A自定义的泛型  a是传入A类的形参
	<A>A 声明为泛型方法
	*/
	public static <A>A getName(A a){
		return a ;
	}
}
