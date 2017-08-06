package com.ouya.zr.collection;

import java.util.LinkedList;

/*
 * LinkedList��ʾ����Ĳ����࣬��ͬʱʵ����List��Queue�ӿڡ�Ƶ���Ĳ����ɾ������������ѡ��LinkedList
 * 	addFirst();��ָ��Ԫ�ز�����б�Ŀ�ͷ��
 *  addLast();��ָ��Ԫ�ز�����а׵Ľ�β��
 *  removeFirst();�Ƴ������ش��б�ĵ�һ��Ԫ�ء�
 *  removeLast();�Ƴ������ش��б�����һ��Ԫ�ء�
 *  add(Object o);��ָ����Ԫ����ӵ��б��С�
 *  
 *  
 * 			ArrayList                             			 Vector(�̰߳�ȫ������̫���ˣ�����)
 * �����д洢�ﵽָ������ʱ���Զ�����Ϊԭ������1/2   		��ʹ�ô洢�ﵽָ������ʱ��ԭ�����Զ�����һ��
 * ���̰߳�ȫ�����ܸ���      					    	�̰߳�ȫ�����ܽϵ�
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
