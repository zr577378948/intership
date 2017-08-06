package com.ouya.zr.demo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Test;

/*
 * ���������5�����󣬲�����Щ�������TreeSet������
	�ֱ����������ַ�ʽ�Լ����е�Ԫ�ؽ������򣬲����������
	1��ʹEmployeeʵ��Comparable�ӿڣ�����name����
	2������TreeSetʱ����Comparator���󣬰����������Ⱥ�����
 */
public class TestEmployee {

	@Test
	public void test1(){
		Comparator com = new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Employee1 &&o2 instanceof Employee1){
					Employee1 e1 = (Employee1)o1;
					Employee1 e2 = (Employee1)o2;
					
					MyDate b1 = e1.getBirthday();
					MyDate b2 = e2.getBirthday();
					if(b1.getYear()!=b2.getYear()){
						return b1.getYear().compareTo(b2.getYear());
					}else {if(b1.getMouth()!=b2.getMouth()){
						return b1.getMouth().compareTo(b2.getMouth());}
					else{
						return b1.getDay().compareTo(b2.getDay());
					}
					}
				}
				return 0;
			}
			
		};
		
		TreeSet set = new TreeSet(com);
		Employee1 em1 = new Employee1("����", 12, new MyDate(12, 1, 1976));
		Employee1 em2 = new Employee1("����", 32, new MyDate(5, 5, 1965));
		Employee1 em3 = new Employee1("����", 18, new MyDate(2, 3, 1954));
		Employee1 em4 = new Employee1("����", 22, new MyDate(4, 12,1840));
		Employee1 em5 = new Employee1("haha", 42, new MyDate(2,  10,1967));
		Employee1 em6 = new Employee1("����", 42, new MyDate(2,  10,1965));
		
		set.add(em1);
		set.add(em2);
		set.add(em3);
		set.add(em4);
		set.add(em5);
		set.add(em6);
		
		Iterator i = set.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
		
	//��Ȼ����  ʹEmployeeʵ��Comparable�ӿڣ�����name����
	/*@Test
	public void test(){
		
		Employee em1 = new Employee("����", 12, new MyDate(12, 1, 1976));
		Employee em2 = new Employee("����", 32, new MyDate(5, 5, 1965));
		Employee em3 = new Employee("����", 18, new MyDate(2, 3, 1954));
		Employee em4 = new Employee("����", 22, new MyDate(4, 12,1840));
		Employee em5 = new Employee("����", 42, new MyDate(2,  10,1967));
		
		TreeSet set = new TreeSet();
		set.add(em1);
		set.add(em2);
		set.add(em3);
		set.add(em4);
		set.add(em5);


		Iterator i = set.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}*/
	
	
	/*@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Employee1 && o2 instanceof Employee1){
			Employee1 e1 = (Employee1)o1;
			Employee1 e2 = (Employee1)o2;
			
			MyDate b1 = e1.getBirthday();
			MyDate b2 = e2.getBirthday();
			if(b1.getYear()!=b2.getYear()){
				return b1.getYear().compareTo(b2.getYear());
				return b1.getYear()-b2.getYear();
			}else {if(b1.getMouth()!=b2.getMouth()){
				return b1.getMouth().compareTo(b2.getMouth());
				return b1.getMouth()-b2.getMouth();
			}else{
					return b1.getDay().compareTo(b2.getDay());
				return b1.getDay()-b2.getDay();
			}
			}
		}
		return 0;
	}*/
}
