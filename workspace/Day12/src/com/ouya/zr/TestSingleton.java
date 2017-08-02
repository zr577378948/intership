package com.ouya.zr;
//����ʽ
public class TestSingleton {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1==s2);//true
	}
}
class Singleton{
//	1.˽�л�������,ʹ��������ⲿ���ܹ����ô˹�����
	private Singleton(){
		
	}
//	2.������ڲ�����һ�����ʵ��
	private static Singleton instance = new Singleton();
//	3.˽�л��˶���ͨ�������ķ� ��������
//	4.�˹����ķ���ֻ��ͨ���������ã��������Ϊstatic
	public static Singleton getInstance(){
		return instance;
	}
}