package com.ouya.zr;
/**
 * 编写一个类实现银行账户的概念，包含的属性有“帐号”、“密码”、“存款余额”、“利率”、“最小余额”，定义封装这些属性的方法。账号要自动生成。
编写主类，使用银行账户类，输入、输出3个储户的上述信息。
考虑：哪些属性可以设计成static属性。

 * @author Administrator
 *
 */
public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int zh = (int) (10*(Math.random()));//账号
		
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