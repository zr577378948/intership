package com.ouya.zr;
/**
 *计算1000以内完数，例如6=1*2*3=1+2+3、28=1+2+4+7+14
 * @author Administrator
 *
 */

public class Test6 {

	public static void main(String[] args) {

		int sum;//定义接收各因子之和的变量
		
		for(int i = 1;i<1000;i++){
				sum=0;
			for(int j = 1;j<i;j++){
					
					if(i%j==0){
						sum +=j;
					}
			}
			if(sum==i){
				
				System.out.print("完数为："+i+"，因子为: ");
				for(int j = 1;j<=i/2;j++){
					if(i%j==0){
						System.out.print(j+" ");
					}
				}
				System.out.println();
				
			}
			
		}
		
	}	

}
