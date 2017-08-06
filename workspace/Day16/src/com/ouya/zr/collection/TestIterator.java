package com.ouya.zr.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import org.junit.Test;

public class TestIterator {

	/**
	 * 迭代器遍历
	 */
	@Test
	public void test1(){
		Collection coll = new ArrayList();
		coll.add(24);
		coll.add(123);
		coll.add("sdf");
		coll.add(new Date());
		
		Iterator i = coll.iterator();
		while(i.hasNext()){//i.next()间隔打印，错误的写法
			System.out.println(i.next());
		}
		
	}
	
	/*
	 * 增强For循环实现集合的遍历
	 */
	@Test
	public void testFor(){
		Collection<Comparable> coll = new ArrayList();
		coll.add(24);
		coll.add(123);
		coll.add("sdf");
		coll.add(new Date());
		
		for(Object i:coll){
			System.out.println(i);
		}
	}
	
	
	/*
	 * 增强For循环实现数组的遍历
	 */
	@Test
	public void testArray(){
		int []a = {1,52,46,4,5,3};
		
		for(int i:a){
			System.out.println(i);
		}
	}
	
	
	/*
	 * 面试题
	 */
	@Test
	public void testMS(){
		String []str = new String[]{"AA","BB","DD"};
			for(int i=0;i<str.length;i++){
				str[i] = i+"";
			}
			for (int i = 0; i < str.length; i++) {
				System.out.println(str[i]);
			}
	}  /*输出0
			1
			2*/
	
	@Test
	public void testMS1(){
		String []str = new String[]{"AA","BB","DD"};
			for(String s:str){//此处的s是个局部变量，不会对值造成影响
				s="NN";
				System.out.println(s);
			}
			for (int i = 0; i < str.length; i++) {
				System.out.println(str[i]);
			}
	} 
	
}
