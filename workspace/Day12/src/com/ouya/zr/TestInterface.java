package com.ouya.zr;
//接口跟具体的类指尖存在多态性
public class TestInterface {

	public static void main(String[] args) {
		Duck d = new Duck();
		TestInterface.test1(d);
		TestInterface.test2(d);
		TestInterface.test3(d);
		
	}
	
	public static void test1(Runner r){
		r.run();//虚拟方法调用
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

		System.out.println("丑小鸭也可以变成白天鹅");
	}

	@Override
	public void swim() {

		System.out.println("红掌波清波");
	}

	@Override
	public void run() {

		System.out.println("鸭子屁股妞妞走路");
	}
	
}