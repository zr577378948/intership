package com.ouya.zr;
/**
 * ʹ�ö�ά�����ӡһ�� 10 ���������.
1
1 1
1 2 1
1 3 3  1
1 4 6  4  1
1 5 10 10 5 1
 ....
  
����ʾ��
 1. ��һ���� 1 ��Ԫ��, �� n ���� n ��Ԫ��
 2. ÿһ�еĵ�һ��Ԫ�غ����һ��Ԫ�ض��� 1
 3. �ӵ����п�ʼ, ���ڷǵ�һ��Ԫ�غ����һ��Ԫ�ص�Ԫ��. 
     yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];

 * @author Administrator
 *
 */
public class YangHui2 {

	public static void main(String[] args) {
		int yang[][] = new int[10][]; 
		//��ʼ��
		for (int i = 0; i < yang.length; i++) {
			yang[i] = new int[i+1] ;//��֤��i����i+1��Ԫ��
		}
		
		//��ֵ
		for(int i=0;i<yang.length;i++){
			for(int j=0;j<=i;j++){
				yang[i][0] = 1;
				yang[i][i] = 1;
				if(i>1&&j>0&&i>j){
					yang[i][j] = yang[i-1][j-1] + yang[i-1][j];
				}
			}
		}
		
		//���
		for(int i=0;i<yang.length;i++){
			for(int j=0;j<i+1;j++){
				System.out.print(yang[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
