package com.ouya.zr;

/**
 * 定义三个重载方法max()，第一个方法求两个int值中的最大值，第二个方法求两个double值中的最大值，第三个方法求三个double值中的最大值，并分别调用三个方法。
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