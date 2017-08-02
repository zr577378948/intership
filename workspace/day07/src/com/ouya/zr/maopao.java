package com.ouya.zr;

/**
 * 冒泡排序法：比较相邻的元素。如果第一个比第二个大，就交换他们两个的值。每对相邻的元素进行相同的操作，从开始第一队进行到最后一对。所以，最后的元素是最大的。
 * 
 * @author Administrator
 *
 */
public class maopao {

	public static void main(String[] args) {

		int[] array1 = new int[] { -9, 54, 4, 7, 5, 78 };

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1.length - 1 - i; j++) {
				if (array1[j] > array1[j + 1]) {
					int temp = array1[j];
					array1[j] = array1[j + 1];
					array1[j + 1] = temp;
				}
			}
			System.out.print(array1[i] + "  ");
		}

	}

}
