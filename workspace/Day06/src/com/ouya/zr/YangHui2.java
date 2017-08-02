package com.ouya.zr;
/**
 * 使用二维数组打印一个 10 行杨辉三角.
1
1 1
1 2 1
1 3 3  1
1 4 6  4  1
1 5 10 10 5 1
 ....
  
【提示】
 1. 第一行有 1 个元素, 第 n 行有 n 个元素
 2. 每一行的第一个元素和最后一个元素都是 1
 3. 从第三行开始, 对于非第一个元素和最后一个元素的元素. 
     yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];

 * @author Administrator
 *
 */
public class YangHui2 {

	public static void main(String[] args) {
		int yang[][] = new int[10][]; 
		//初始化
		for (int i = 0; i < yang.length; i++) {
			yang[i] = new int[i+1] ;//保证第i行有i+1个元素
		}
		
		//赋值
		for(int i=0;i<yang.length;i++){
			for(int j=0;j<=i;j++){
				yang[i][0] = 1;
				yang[i][i] = 1;
				if(i>1&&j>0&&i>j){
					yang[i][j] = yang[i-1][j-1] + yang[i-1][j];
				}
			}
		}
		
		//输出
		for(int i=0;i<yang.length;i++){
			for(int j=0;j<i+1;j++){
				System.out.print(yang[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
