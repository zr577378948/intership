package com.ouya.zr;
/**
 * ���壺ĳһ��ʵ����ڶ�����̬
 * @author Administrator
 *
 */
public class Demo {
	public static void main(String[] args) {
		Cat c = new Cat();
		don(c);
		Animal d = new Dog();
		don(d);
		//d.look();
		//����ת�ͣ�������ת��Ϊ���࣬�����Դ������Է����ᱻ����
//		don(new Dog());
//		����������þ���ĳ�ֶ�����������ݣ��Զ�������ת�ͣ�ǿת
		Dog e = (Dog)d;
		e.eat();
		e.look();
	}
	
//	����֮�䲻��ǿת
	Animal cc = new Cat();
	Dog dd = (Dog)cc;
	
	
	public static void don(Animal a){
		a.eat();
		
	}

}

abstract class Animal{
	abstract void eat();
}

class Dog extends Animal{

	@Override
	void eat() {
		System.out.println("�ԺóԵ�");
	}
	void look(){
		System.out.println("����");
	}
	
	
}

class Cat extends Animal{

	@Override
	void eat() {
		System.out.println("������");
	}
	void work(){
		System.out.println("����");
	}
	
	
}