package com.ouya.zr.Thread;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * �쳣��
 * @author Administrator
 *java.lang.ArithmeticException�����߼��쳣
 *
 *
 *try{
�п��ܻ���������
}catch(�쳣�� �쳣����){
��Ӧ���쳣�������
}��finally{
һ�������еĴ���
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
			System.out.println("��������쳣");
		}
		
		
	}
}