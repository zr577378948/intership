package com.ouya.zr;

import org.junit.Test;

public class TestWrapper {
	//���������������װ��֮���ת��
	//������������--->��װ�ࣺ���ð�װ��Ĺ�����
	@Test
	public void test(){
		
		int i = 10;
		Integer i1 = new Integer(i); 
		System.out.println(i1);
		i1 = new Integer("12");
		System.out.println(i1);//12
		//��װ��--->�����������ͣ�
		int i2 = i1.intValue();
		
		Float f = new Float(12.3F);
		System.out.println(f);
		
		Boolean b = new Boolean(false);
		Boolean b1 = new Boolean("true");//true
		System.out.println(b);
		
		//����Boolean����,���β���"true",����true,����������false��
		b1 = new Boolean("truesdrf");
		System.out.println(b1);
	}

}