package com.ouya.zr;

import java.util.Scanner;

/**
 * �Ӽ�������С������ĩ�ɼ���
���ɼ�Ϊ100��ʱ������һ��BMW��
���ɼ�Ϊ��80��99)ʱ������һ��̨iphone8��
���ɼ�Ϊ[60,80]ʱ������һ���ο��飻
����ʱ��ʲô����Ҳû�С�
�Ӽ�������С������ĩ�ɼ���
���ɼ�Ϊ100��ʱ������һ��BMW��
���ɼ�Ϊ��80��99)ʱ������һ��̨iphone8��
���ɼ�Ϊ[60,80]ʱ������һ���ο��飻
����ʱ��ʲô����Ҳû�С�

 * @author Administrator
 *
 */

public class Test1 {

	public static void main(String[] args) {
		System.out.println("������ɼ���");
	
		Scanner s = new Scanner(System.in);
		int grade = s.nextInt();
		
		if(grade>=0&&grade<=100){
			if (grade==100) {
				System.out.println("����һ��BMW");
			} else if (80<grade&&grade<99) {
				System.out.println("����һ��̨iphone8");
			}else if (60<=grade&&grade<=80) {
				System.out.println("����һ���ο���");
			}else {
				System.out.println("ʲô����Ҳû��");
			}
		}
		
	}

}
