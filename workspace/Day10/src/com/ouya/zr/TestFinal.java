/*package com.ouya.zr;
*//**
 * �����ࡢ���ԡ�����
 * 1.�����಻�ܱ��̳�
 * ����:String�ࡢStringBuffer�ࡢSystem��
 * 2.final���η���Ϊ���յġ����ܱ���д���磺Object���getClass() 
 * 3.final�������ԣ������Ծ���һ������,һ����ʼ���󣬲����ٱ���ֵ��ϰ���ϣ������ô�д�ַ���ʾ��
 * �˳��������︳ֵ��1.�˳�������ʹ��Ĭ�ϳ�ʼ��2.������ʽ�ĸ�ֵ������顢������
 * 
 * ������static���Σ�ȫ�ֳ���
 * 
 * >��final finalize()���ֿ�
 * @author Administrator
 *
 *//*
public class TestFinal {
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.getClass());
		System.out.println(Math.PI);
	}

}

//����
final class A11 {
	final int I  = 12 ;
	final double PI;
	final String name;
	final int J;
	//�����в����Ը�ֵ
	public void m1(){
		System.out.println(I);
		//I=10;
		//J = 10;
	}
	{
		PI = 3.14;
	}
	public A11(){
		name = "dsf";
		
	}
	
	public A11(String n){
		name = n;
		
	}
}

class C{ 
	public final  void method1(){
		System.out.println("methode1");
	}
}


//���ܱ���д
class D extends C{
	public void method1(){
		System.out.println("methode1...");//...��ʾ��д
	}
}*/