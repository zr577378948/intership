package com.ouya.zr;
/**
 * 求圆的面积
 * @author Administrator
 *
 */
public class Area {

	public static void main(String[] args) {

		MianJi mj = new MianJi();
		mj.show();
	}

}
	class MianJi{
		int r = 12;
		double pi = 3.14;
		
		public void show(){
			System.out.println("圆的面积为："+r*pi);
	} 
}