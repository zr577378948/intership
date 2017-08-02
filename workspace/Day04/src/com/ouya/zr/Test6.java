package com.ouya.zr;

import java.util.Scanner;

/**
 * 编写程序：从键盘上读入一个学生成绩，存放在变量score中，根据score的值输出其对应的成绩等级：

score>=90           等级：A
70=<score<90     等级: B
60=<score<70     等级: C
score<60             等级：D 
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



