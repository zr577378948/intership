package com.ouya.zr;
/**
 * 可变个数的参数
	1.以... 结构：数据类型+...+形参名。
	2.可变个数形参的方法与同名方法之间构成重载。
	3.可变个数形参从0开始到无限。
	4.可变个数形参跟数组使用一致。
	5.可变个数形参不能放在形参最前，一个方法形参中只能够有一个可变个数形参。

 * @author Administrator
 *
 */
public class NiMing {

	public static void main(String[] args) {

		NiMing nm = new NiMing();
		nm.hello();
		nm.hello(new String[]{"haha","jajaja","fgdf"});
		nm.hello("dsf","df");
		nm.hello(45, "sefse","efwer","sdf");
	}

	public void hello(String str){
		System.out.println(str);
		
	}
	
	public void hello(String ...str){
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		
	}
	
	public void hello(int a,String ...str){
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]+a);
		}
		
		
	}
	
	public void hello(int a){
		System.out.println(a);
		
	}
}


