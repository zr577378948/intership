package com.ouya.zr;

public class FinalTest1 {

}

class A1{
	final static String name="123";
	
	public final void pr(){
		System.out.println("123");
	}
}
class B1 extends A1{
	
	//���෽����final�����಻����д
	/*public final void pr(){
		System.out.println("321");
	}*/
	
	public void s(){
		System.out.println(name);
	}
}