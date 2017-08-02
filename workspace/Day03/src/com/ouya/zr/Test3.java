package com.ouya.zr;

import java.util.Scanner;

/**
 * 大家都知道，男大当婚，女大当嫁。那么女方家长要嫁女儿，当然要提出一定的条件：高：180cm以上；富：财富1千万以上；帅：是。
 * 如果这三个条件同时满足，则：“我一定要嫁给他!!!” 如果三个条件有为真的情况，则：“嫁吧，比上不足，比下有余。” 如果三个条件都不满足，则：“不嫁！”
 * Sysout(“身高: (cm)) scanner.nextInt(); Sysout(“财富: (千万)) scanner.nextDouble();
 * Sysout(“帅否: (true/false)) (是/否) scanner.nextBoolean(); scanner.next();
 * str.equals(“是”)
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

		System.out.println("身高："+high+"(cm);财富："+money+"(千万);帅："+appr);
		
		if (high > 180 && money > 1 && "是".equals(appr)) {
			System.out.println("我一定要嫁给他!!!");
		} else if (high > 180 || money > 1 || "是".equals(appr)) {
			System.out.println("嫁吧，比上不足，比下有余!");
		} else {
			System.out.println("不嫁");
		}

	}
}
