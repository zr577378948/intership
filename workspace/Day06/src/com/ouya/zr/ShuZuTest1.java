package com.ouya.zr;

import java.util.Scanner;

/**
 * ���̶���ѧ���ɼ����ҳ���߷֣������ѧ���ɼ��ȼ�
 * �ɼ�>=��߷�-10  �ȼ�Ϊ'A'
 * �ɼ�>=��߷�-20  �ȼ�Ϊ'B'
 * �ɼ�>=��߷�-30  �ȼ�Ϊ'C'
 * ����            		  �ȼ�Ϊ'D'
 * @author Administrator
 *
 */
public class ShuZuTest1 {



	public static void main(String[] args) {
		int max= 0;
		Scanner s = new Scanner(System.in);
		System.out.println("������ѧ��������");
		int num = s.nextInt();
		System.out.println("������"+num+"���ɼ�");
		int []stu = new int[num];
		
		for(int i=0;i<stu.length;i++){
			int score = s.nextInt();
			stu[i] = score;
			if(stu[i]>max){
				max = stu[i];
			}
		}
		
		//��߳ɼ�
		System.out.println("��߳ɼ�Ϊ��"+max);
		char leval;
		
		for (int i = 0; i < stu.length; i++) {
			if(stu[i]>=max-10){
				leval = 'A';
			}else if(stu[i]>=max-20){
				leval = 'B';
			}else if(stu[i]>=max-30){
				leval = 'C';
			}else{
				leval = 'D';
			}
			System.out.println("student "+ i +" score is "+stu[i]+",�ȼ�Ϊ "+leval);
		}
		
		
	}
}
