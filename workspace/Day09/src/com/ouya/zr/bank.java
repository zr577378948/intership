package com.ouya.zr;
/**
 * ��дһ����ʵ�������˻��ĸ�������������С��ʺš��������롱����������������ʡ�������С���������װ��Щ���Եķ������˺�Ҫ�Զ����ɡ�
��д���࣬ʹ�������˻��࣬���롢���3��������������Ϣ��
���ǣ���Щ���Կ�����Ƴ�static���ԡ�

 * @author Administrator
 *
 */
public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int zh = (int) (10*(Math.random()));//�˺�
		
		yh y = new yh();
		System.out.println(zh);
	}

}
class yh{
	private int mm;
	private double ye;
	private double ln;
	private double xye;
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public double getYe() {
		return ye;
	}
	public void setYe(double ye) {
		this.ye = ye;
	}
	public double getLn() {
		return ln;
	}
	public void setLn(double ln) {
		this.ln = ln;
	}
	public double getXye() {
		return xye;
	}
	public void setXye(double xye) {
		this.xye = xye;
	}
	
	
}