package com.ouya.zr;

import java.util.Scanner;

/**
 * ʹ�� switch ��Сд���͵� char��תΪ��д��ֻת�� a, b, c, d, e. ��������� ��other����

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
