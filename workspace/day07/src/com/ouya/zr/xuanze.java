package com.ouya.zr;
/**
 * ��ÿһ�˼�¼��ѡȡ��С��һ��Ԫ�����¼����r���н�����ʹ�������в�������ֱ��ȫ��������ɡ�
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
