package com.ouya.zr;
/**
 * 使用简单数组
(1)创建一个名为TestArray的类，在main()方法中声明array1和array2两个变量，他们是int[]类型的数组。
(2)使用大括号{}，把array1初始化为8个素数：2,3,5,7,11,13,17,19。
(3)显示array1的内容。
(4)赋值array2变量等于array1，修改array2中的偶索引元素，使其等于索引值(如array[0]=0,array[2]=2)。打印出array1。
0 3 2 7 4 13 6 19
 * @author Administrator
 *
 */
public class ShuZuTest2 {
	public static void main(String[] args) {
		int []array1 = new int[]{2,3,5,7,11,13,17,19};
		for (int i = 0; i < array1.length; i++) {
			System.out.println("第一个数组："+array1[i]);
		}
		
		int []array2 = new int[8];
		for (int i = 0; i < array2.length; i++) {
			array2[i]=array1[i];
		}
		
		/*for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i]+" ");
		}*/
		
		for (int i = 0; i < array2.length; i++) {
			
			
			if(i%2==0){
				array2[i]=i;
			}
			System.out.print(array2[i]+" ");
		}
	}

}
