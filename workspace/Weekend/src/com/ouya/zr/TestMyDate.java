package com.ouya.zr;

public class TestMyDate {

	public static void main(String[] args) {
		MyDate m1 = new MyDate();
		MyDate m2 = new MyDate();	
		System.out.println(m1 == m2);
		System.out.println(m1.equals(m2));
	}
}

class MyDate{
	
	@Override
	public boolean equals(Object obj) {
		return true;
	}
}