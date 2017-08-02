package com.ouya.zr;
//�ӿڸ��������ָ����ڶ�̬��
public class TestInterface {

	public static void main(String[] args) {
		Duck d = new Duck();
		TestInterface.test1(d);
		TestInterface.test2(d);
		TestInterface.test3(d);
		
	}
	
	public static void test1(Runner r){
		r.run();//���ⷽ������
	}
	
	public static void test2(Swimmer s){
		s.swim();
	}
	
	public static void test3(Filer f){
		f.fly();
	}
}

interface Runner{
	public abstract void run();
	
}
interface Swimmer{
	void swim();
}
interface Filer{
	void fly();
}

class Duck implements Runner,Swimmer,Filer{

	@Override
	public void fly() {

		System.out.println("��СѼҲ���Ա�ɰ����");
	}

	@Override
	public void swim() {

		System.out.println("���Ʋ��岨");
	}

	@Override
	public void run() {

		System.out.println("Ѽ��ƨ������·");
	}
	
}