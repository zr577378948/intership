package com.ouya.zr.Thread;

public class TestBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("haha");
		sb.append("dashabi");
		
		sb.append("\t");
		sb.append(1);
		
		sb.append(true);
		System.out.println(sb);
		
		sb.insert(0, "$11");
		System.out.println(sb);
	}
}