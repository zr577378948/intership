package com.ouya.zr.Thread;

import org.junit.Test;

public class TestString {

	/**
	 * �ַ������ֽ������ת��
	 * �ַ���ת�ֽ����飺������ͨ����getBytes();
	 * �ֽ�����ת�ַ����������������ַ���������
	 * 
	 * 
	 * �ַ������ַ�����ת��
	 * �ַ���ת�ַ����飺�����������ַ���toCharArray();
	 * �ַ�����ת�ַ����������������ַ���������
	 * 
	 */
	@Test
	public void test(){
//		�ַ������ֽ�����ת��
		String str = "asfdsssda";
		byte[] b = str.getBytes();
		for(int i=0;i<b.length;i++){
			System.out.print((char)b[i]+" ");
		}
		
		String str1 = new String(b);
		System.out.println(str1);
		
		
		String str2 = "fgdsgdsfgdfsg����";
		char[] cs  = str2.toCharArray();
		for(int i=0;i<cs.length;i++){
			System.out.print((char)cs[i]+" ");
		}
		
		String str3 = new String(cs);
		System.out.println(str3);
		
	}
}
