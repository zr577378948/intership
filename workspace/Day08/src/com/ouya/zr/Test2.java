package com.ouya.zr;

/**
 * ��д���򣬶����������ط��������á�������ΪmOL��
���������ֱ����һ��int����������int������һ���ַ����������ֱ�ִ��ƽ�����㲢����������˲�������������ַ�����Ϣ��
�������main ()�����зֱ��ò��������������������

 * @author Administrator
 *
 */
public class Test2 {
	public static void main(String[] args) {
		/*Ol o = new Ol();
		o.mOL(2);
		o.mOL(2, 4);
		o.mOL("hello");*/
		//�����ڲ���
		show(new Ol());
		new Ol().mOL(1);
			
	}
	
	public static void show(Ol o){
		o.mOL(2);
		o.mOL("aaa");
	}

}
class Ol{
	public void mOL(int a){
		System.out.println(a*a);
	}
	
	public void mOL(int a,int b){
		System.out.println(a*b);
	}
	public void mOL(String a){
		System.out.println(a);
	}
}