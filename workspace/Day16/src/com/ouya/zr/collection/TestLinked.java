package com.ouya.zr.collection;

import java.util.LinkedList;

/*
 * LinkedList表示链表的操作类，它同时实现了List和Queue接口。频繁的插入和删除操作，建议选择LinkedList
 * 	addFirst();将指定元素插入此列表的开头。
 *  addLast();将指定元素插入此列白的结尾。
 *  removeFirst();移除并返回此列表的第一个元素。
 *  removeLast();移除并返回此列表的最后一个元素。
 *  add(Object o);将指定的元素添加到列表中。
 *  
 *  
 * 			ArrayList                             			 Vector(线程安全，但是太旧了，不用)
 * 当所有存储达到指定容量时，自动增长为原容量的1/2   		当使用存储达到指定容量时，原容量自动增长一倍
 * 非线程安全且性能更高      					    	线程安全但性能较低
 */
public class TestLinked {

	public static void main(String[] args) {
		Student stu = new Student("zhangsan",23,"xian");
		Student stu1 = new Student("lisi",23,"xian");
		Student stu2 = new Student("wangwu",23,"xian");
		
		LinkedList<Student>list = new LinkedList<Student>();
		list.add(stu);
		list.add(stu1);
		list.add(stu2);
		list.add(stu2);
		list.addFirst(stu2);
		
		list.remove(stu2);
		
		list.set(1, stu);
		System.out.println(list);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
	}
}
