package com.ouya.zr;

import java.util.Scanner;

/**
 * ��д���򣺴Ӽ����϶���һ��ѧ���ɼ�������ڱ���score�У�����score��ֵ������Ӧ�ĳɼ��ȼ���

score>=90           �ȼ���A
70=<score<90     �ȼ�: B
60=<score<70     �ȼ�: C
score<60             �ȼ���D 
 * @author Administrator
 *
 */

public class Test6 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); 
		 int score = s.nextInt();
		
		
		 switch(score/10){
		 default :
				System.out.println("A");
				break;
		 case 8 :
		 case 7 :
			 System.out.println("B");
				break;
		 case 6 :
			 System.out.println("C");
				break;
		 case 5 :
		 case 4 :
		 case 3 :
		 case 2 :
		 case 1 :
		 case 0 :
			 System.out.println("D");
				break;
		
				

	}
	}

}



