package com.ouya.zr;

/**
 * static ��̬�ģ��������ǵĳ�Ա��
�ص㣺1.������ļ��ض����أ����ȶ�����ڡ�
  	2.�����еĶ����á�
	3.���Ա���ֱ�ӵ��á�
 * @author Administrator
 *
 */
public class StaticTest {


	{
		
		St s = new St();
		s.age = 4;
		s.info();
		//����������ֱ�ӵ���
		St.age = 5;
		s.info();
	}

}

class St{
	static int age;
	String name;
	
	public void  info(){
		
		System.out.println("name:"+name+",age:" + age);
	}
}