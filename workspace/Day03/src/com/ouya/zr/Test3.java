package com.ouya.zr;

import java.util.Scanner;

/**
 * ��Ҷ�֪�����д󵱻飬Ů�󵱼ޡ���ôŮ���ҳ�Ҫ��Ů������ȻҪ���һ�����������ߣ�180cm���ϣ������Ƹ�1ǧ�����ϣ�˧���ǡ�
 * �������������ͬʱ���㣬�򣺡���һ��Ҫ�޸���!!!�� �������������Ϊ���������򣺡��ްɣ����ϲ��㣬�������ࡣ�� ������������������㣬�򣺡����ޣ���
 * Sysout(�����: (cm)) scanner.nextInt(); Sysout(���Ƹ�: (ǧ��)) scanner.nextDouble();
 * Sysout(��˧��: (true/false)) (��/��) scanner.nextBoolean(); scanner.next();
 * str.equals(���ǡ�)
 * 
 * @author Administrator
 *
 */
public class Test3 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int high = s.nextInt();
		double money = s.nextDouble();
		String appr = s.next();

		System.out.println("��ߣ�"+high+"(cm);�Ƹ���"+money+"(ǧ��);˧��"+appr);
		
		if (high > 180 && money > 1 && "��".equals(appr)) {
			System.out.println("��һ��Ҫ�޸���!!!");
		} else if (high > 180 || money > 1 || "��".equals(appr)) {
			System.out.println("�ްɣ����ϲ��㣬��������!");
		} else {
			System.out.println("����");
		}

	}
}
