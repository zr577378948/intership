package com.ouya.zr.fz;

public class TestAnimal {
	public static void main(String[] args) {
		Animal a1  = new Animal();
		a1.name = "haha";
		a1.legs = 4;
		a1.eat();
		a1.sleep();
	}

	
}
class Animal{
	String name;
	int legs;
	
	public void eat(){
		System.out.println("�����ʳ");
	}
	
	public void sleep(){
		System.out.println("����˯��");
	}
}