package com.ouya.zr;

import java.util.Scanner;

public class xunhuan {

	public static void main(String[] args) {

		@SuppressWarnings("resource")

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		if (12 >= a && a >= 1) {
			if (3 <= a && a <= 5) {
				System.out.println("����");
			} else

				if (6 <= a && a <= 8) {
					System.out.println("����");
				}

				else if (9 <= a && a <= 11) {
					System.out.println("����");
				} else {
					System.out.println("����");
				}
		}
	}

}
