package com.ouya.zr.Thread;

import java.util.Arrays;

//Arrays是数组的操作类，主要实现数组的元素查找、内容填充、排序等
public class TestArray {

	public static void main(String[] args) {
		int array[] = {2,354,35,65};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));//以字符串输出数组
		
		/*
		int p = Arrays.binarySearch(array, 65);
		System.out.println(p);*/
	}
}
