package com.ouya.zr;

/**
 * �����������ط���max()����һ������������intֵ�е����ֵ���ڶ�������������doubleֵ�е����ֵ������������������doubleֵ�е����ֵ�����ֱ��������������
 * @author Administrator
 *
 */
public class Test1 {
	public static void main(String[] args) {
		OverLoad1 o = new OverLoad1();
		/*o.max(-2, 4);
		o.max(1.0,5.2);
		o.max(1.0, -2.5, 6);*/
		System.out.println(o.max(5, 4));
		System.out.println(o.max(5.5, 6.4));
		System.out.println(o.max(5.5, -4.3,2.0));
	}

}
/*class OverLoad1{
	public void max(int a,int b){
		System.out.println(Math.max(a, b));
	}
	
	public void max(double a,double b){
		System.out.println(Math.max(a, b));
	}
	
	public void max(double a,double b,double c){
		System.out.println(Math.max(Math.max(a, b), c));
		
	}
	
}*/

class OverLoad1{
	public int max(int a,int b){
		return (a>b)?a:b;
	}
	
	public double  max(double a,double b){
		return (a>b)?a:b;
	}
	
	public double max(double a,double b,double c){
		return max(a, b)>c?max(a, b):c;
		
	}
	
}