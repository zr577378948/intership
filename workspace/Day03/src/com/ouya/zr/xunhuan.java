package com.ouya.zr;

import java.util.Scanner;

public class xunhuan {

	public static void main(String[] args) {

		@SuppressWarnings("resource")

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		if (12 >= a && a >= 1) {
			if (3 <= a && a <= 5) {
				System.out.println("春天");
			} else

				if (6 <= a && a <= 8) {
					System.out.println("夏天");
				}

				else if (9 <= a && a <= 11) {
					System.out.println("秋天");
				} else {
					System.out.println("东天");
				}
		}
	}

}
