package com.ouya.zr;
/**
 * ���󣺱����Ͳ����ڣ�û�ж�Ӧ��ʵ�� 
 * Ȯ�ƣ���һ�ֳ������������ڵ����Ǻ͹�
 * ��������Դ������󣬵��Ǵ���������÷���û���κ�����
 * 
 * abstract:������ؼ���
 * ����ֻ��������û�з�����
 * �����಻�ܱ�ʵ������Ҳ������new��������
 * 
 * ������ͨ������ʵ������������ʵ�ָ��ǳ������еĳ��󷽷�����ܴ������󣬷��������Ҳ�ǳ�����
 * 
 * 
 * @author Administrator
 *
 */
public class AbstractTest {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		
		Wolf w = new Wolf();
		w.eat();
	}
}

abstract class Quan{
	
	abstract void eat();
}

class Dog extends Quan{
	void eat(){
		System.out.println("��������");
	}
}

class Wolf extends Quan{
	void eat(){
		System.out.println("���ǳ���");
	}
}