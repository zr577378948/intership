package com.ouya.zr;

/**
 * ð�����򷨣��Ƚ����ڵ�Ԫ�ء������һ���ȵڶ����󣬾ͽ�������������ֵ��ÿ�����ڵ�Ԫ�ؽ�����ͬ�Ĳ������ӿ�ʼ��һ�ӽ��е����һ�ԡ����ԣ�����Ԫ�������ġ�
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