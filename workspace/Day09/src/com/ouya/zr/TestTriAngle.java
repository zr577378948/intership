package com.ouya.zr;

/**
 * ��д�����࣬TriAngle��TestTriAngle������TriAngle������˽�еĵױ߳�base�͸�height��
 * ͬʱ����������������˽�б�������һ������ʹ����Щ�������������������ε������
 * @author Administrator
 *
 */
public class TestTriAngle {

	public static void main(String[] args) {
		//TriAngle t = new TriAngle(3.0,6.0);
		//System.out.println(t.area());
		TriAngle t = new TriAngle();
		t.setBase(2.0);
		t.setHeight(2.0);
		System.out.println(t.area());
		//System.out.println(t.getBase()*t.getHeight()*0.5);
		
	}

}

class TriAngle{
	
	private double base;
	private double height;
	
	//����������
	/*public TriAngle(double base,double height){
		this.base = base;
		this.height = height;
	}*/
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double area(){
		return 0.5*base*height;
	}
}
