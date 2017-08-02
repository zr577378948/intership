package com.ouya.zr.Thread;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 异常：
 * @author Administrator
 *java.lang.ArithmeticException算数逻辑异常
 *
 *
 *try{
有可能会出错的语句
}catch(异常类 异常对象){
对应的异常处理语句
}发finally{
一定会运行的代码
}
 */
public class TestError {

	public static void main(String[] args) {
	/*	String a[] = new String[5];
		System.out.println(a[5]);*/
		Scanner s = new Scanner(System.in);
		
		try {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = a/b;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch(InputMismatchException i){
			System.out.println(i.getMessage());
			i.printStackTrace();
		}finally{
			System.out.println("结果出现异常");
		}
		
		
	}
}
