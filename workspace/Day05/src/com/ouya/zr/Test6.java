package com.ouya.zr;
/**
 *����1000��������������6=1*2*3=1+2+3��28=1+2+4+7+14
 * @author Administrator
 *
 */

public class Test6 {

	public static void main(String[] args) {

		int sum;//������ո�����֮�͵ı���
		
		for(int i = 1;i<1000;i++){
				sum=0;
			for(int j = 1;j<i;j++){
					
					if(i%j==0){
						sum +=j;
					}
			}
			if(sum==i){
				
				System.out.print("����Ϊ��"+i+"������Ϊ: ");
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
