package com.ouya.zr;

import java.util.Scanner;

/**
 * 使用 switch 把小写类型的 char型转为大写。只转换 a, b, c, d, e. 其它的输出 “other”。

 * @author Administrator
 *
 */

public class Test1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String a = s.next();
		switch(a){
		case("a"):
			System.out.println("A");
		break;
		case("b"):
			System.out.println("B");
		break;
		case("c"):
			System.out.println("C");
		break;
		case("d"):
			System.out.println("D");
		break;
		case("e"):
			System.out.println("E");
		break;
		default:
			System.out.println("other");
		}

	}

}
