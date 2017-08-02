package com.ouya.zr;

import org.junit.Test;

public class TestJunit {

	public static void main(String[] args) {

		String a = "AA";
		System.out.println(a);
	}
	
	
	@Test
	public void test(){
	
		String b = "BB";
		System.out.println(b);
	}

	@Test
	public void test1(){
	
		String c = "CC";
		System.out.println(c);
	}
}
