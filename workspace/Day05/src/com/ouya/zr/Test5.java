package com.ouya.zr;
/**
 * ���100�������е�����
 * @author Administrator
 *
 */

public class Test5 {

	public static void main(String[] args) {
/*
		for(int i = 2;i<100;i++){
			
				boolean t = false;
				for(int j = 2;j<i;j++){
				if(i%j==0){
					t = false;
					break;
				
				}else{
					t = true;
				}
				if(t){
					System.out.println(i+" ");
				
				
			}
				}
				
			
		}*/
		long time = System.currentTimeMillis();//���յ�ǰʱ��
		
		l: for(int i=2;i<100;i++){
			for(int j=2;j<Math.sqrt(i);j++){//��i������
				if(i%j==0){
					continue l;
				}
			}
			System.out.println(i);
			
		}
		long end = System.currentTimeMillis();
		System.out.println("������"+(end-time)+"��");
		
	}	

}
