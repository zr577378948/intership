package com.ouya.zr;

public class TestEquals1 {

	public static void main(String[] args) {
		String str1 = new String("AA");
		String str2 = new String("AA");
		System.out.println(str1==str2);//flase
		System.out.println(str1.equals(str2));//true,String类重写了Object类的equals()
		System.out.println("..........................");
		String q = "AA";
		String w = "AA";
		System.out.println(q == w);//true
		System.out.println(q.equals(w));//true
		System.out.println(str1 ==q);//false
		System.out.println(str1.equals(q));//ture
	}
}
