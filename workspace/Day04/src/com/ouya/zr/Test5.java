package com.ouya.zr;

import java.util.Scanner;

/**
 * 使用switch语句改写下列if语句：
 	 int a = 3;
 	 int x = 100;
 	 if(a==1)
		x+=5;
 	 else if(a==2)
		x+=10;
 	 else if(a==3)
		x+=16;
 	 else		
		x+=34;

 * @author Administrator
 *
 */
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); 
		 int a = s.nextInt();
	 	 int x = 100;
		
		
		 switch(a){
		 case 1 :
			 x+=5;
				System.out.println(x);
				break;
		 case 2 :
				x+=10;
				System.out.println(x);
				break;
		 case 4 :
				x+=16;
				System.out.println(x);
				break;
		 default:
				x+=34;
				System.out.println(x);

	}
	}
}
