package com.ouya.zr;
/**
 * ��������ת��:��С����char,byte,short=>int=>long=>float=>double
 * char,byte,short����ʱ,�Զ�ת��Ϊint����
 * @author Administrator
 *
 */
public class zhuanhuan {

	public static void main(String[] args) {
		int a=5;
		long d=3l;
		long f=a+d;
		
		double g=1.5;
		double r=d+g;
		
		char h = 'a';//97
		short j = 9;
		int w = h+j;
		/*System.out.println(f);
		System.out.println(r);
		System.out.println(w);*/
		
		/**
		 * �ַ�������String
		 * ��+���������ӵ����ã��������㡣
		 * char������int������+��char������ASCII�����int�������
		 */
		
		String a1 ="12a";
		int t = 12;
		System.out.println(a1+h);
		System.out.println(t+h);

	}

}