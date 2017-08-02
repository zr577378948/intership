package com.ouya.zr;
/**
 * 数组长度一旦被初始化，就不能给数组里添加多余的数据了
 * @author Administrator
 *
 */
public class shuzu2 {

	public static void main(String[] args) {
		
		int[] arrays = new int [2];
		arrays[0] = 1;
		arrays[1] = 5;
		
		int[] a = new int[10];
		for(int i=0;i<arrays.length;i++){
			a[i] = arrays[i];
			System.out.print(arrays[i]);
			
		}
		System.out.println();
		a[3] = 15;
		a[4] = 9;
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
			
		}
	}
}
