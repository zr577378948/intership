package com.ouya.zr.Thread;

import java.util.Arrays;

//Arrays������Ĳ����࣬��Ҫʵ�������Ԫ�ز��ҡ�������䡢�����
public class TestArray {

	public static void main(String[] args) {
		int array[] = {2,354,35,65};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));//���ַ����������
		
		/*
		int p = Arrays.binarySearch(array, 65);
		System.out.println(p);*/
	}
}