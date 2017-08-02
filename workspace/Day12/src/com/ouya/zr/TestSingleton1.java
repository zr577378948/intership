package com.ouya.zr;
//¿¡∫∫ Ω
public class TestSingleton1 {

	public static void main(String[] args) {
		Singleton x1 = Singleton.getInstance();
		Singleton x2 = Singleton.getInstance();
		System.out.println(x1==x2);
	}
}

class Singleton1{
	
	private Singleton1(){
		
	}
	
	private static Singleton1 instance = null;

	public static Singleton1 getInstance() {
		if(instance==null){
			instance = new Singleton1();
		}
		return instance;
	}

	
}