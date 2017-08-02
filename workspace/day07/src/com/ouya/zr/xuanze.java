package com.ouya.zr;
/**
 * 在每一趟记录中选取最小的一个元素与记录数组r进行交换，使有序序列不断增长直到全部排序完成。
 * @author Administrator
 *
 */
public class xuanze {

	public static void main(String[] args) {
		
		int array1[] = new int[]{2,16,45,79,-85,4};
		
		for (int i = 0; i < array1.length; i++) {
			int t = i;
			for (int j = i+1; j < array1.length; j++) {
				if(array1[t]>array1[j]){
					t = j;
				}
			}
			
			if(t!=array1[i]){
				int temp = array1[i];
				array1[i] = array1[t];
				array1[t] = temp;
			}
			
		}
		
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i]+"  ");
		}
	}

}
