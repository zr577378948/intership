package com.ouya.zr;
/**
 * ����100����ż���ĺ�
 * @author Administrator
 *
 */
public class DoWhileTest2 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		int num = 0;
		/*while(i<100){
			if(i%2==0){
				sum +=i;
				num ++;
			}
			i++;
		}*/
		do{
			if(i%2==0){
				sum +=i;
				num ++;
			}
			i++;
		}while(i<100);
		System.out.println("ż������Ϊ��"+num);
		System.out.println("ż����Ϊ��"+sum);
		
	}

}
