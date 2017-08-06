package com.ouya.zr.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

/*
 * TreeSet�������ṩ������������
 * 1.��TreeSet��ӵ�Ԫ�ر�����ͬһ�����е�
 * 2.���԰�����ӽ������е�Ԫ��ָ����˳���������String����װ���Ĭ�ϰ��մ�С�����˳����б���
 * 3.����TreeSet������Զ�����Ķ���ʱ�����������򷽷�:1.��Ȼ����2.��������
 * ��Ȼ����Ҫ���Զ�����ʵ����java.lang.comparable�ӿڲ���дcompareTo(Object o),�����Զ������������
 * 4.��TreeSet�����Ԫ��ʱ�����Ȱ���compareTo�������бȽϣ�һ������0����Ȼ��ʵ��������Ĵ�����ֵ��ͬ�����ǳ���
 * ����Ϊ������������ͬ�ģ�������һ���Ͳ�����ӽ�����Ҫ��compareTo(0��hashCode()�Լ�equals()���߱���һ��
 */

public class TestTreeSet {
	
	public static void main(String[] args) {
		Student stu = new Student("zhangsan",23,"xian");
		Student stu1 = new Student("lisi",21,"xian");
		Student stu2 = new Student("wangwu",20,"xian");
		
		TreeSet<Student> ts = new TreeSet<Student>();
		ts.add(stu);
		ts.add(stu1);
		ts.add(stu2);
		
		Iterator<Student> iterator = ts.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	@Test
	public void test(){
		Set set = new TreeSet();
		/*set.add("BB");
		set.add("AA");
		set.add("xx");
		set.add(new String("aa"));
		System.out.println(set);*/
		set.add(new Student("lllloooo",15, "xiasn"));
		set.add(new Student("xx",11, "xiasn"));
		set.add(new Student("jj",17, "xiasn"));
		
		System.out.println(set);
		
	}
	
	
	/*
	 * Customer��
	 * TreeSet�Ķ�������
	 */
	@Test
	public void testTree(){
		//1.����һ��ʵ����Comparator�ӿڵ������
		Comparator  com = new Comparator(){
			//��TreeSet�����Customer��Ķ����ڴ�compare()�����У�ָ������Cuatomer���ĸ����Խ�������ġ�
			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Customer && o2 instanceof Customer){
					Customer c1 = (Customer)o1;
					Customer c2 = (Customer)o2;
					int i= c1.getName().compareTo(c2.getName());
					if(i==0){
						return c1.getId().compareTo(c2.getId());
					}
					return i;
				}
				return 0;
			}
			
		};
		//2.���˶�����Ϊ�βδ��ݸ�TreeSet�Ĺ�������
		TreeSet set = new TreeSet(com);
		//3.��TreeSet�����Comparator�ӿ��е�compare�������漰����Ķ���
		set.add(new Customer("AA",123));
		set.add(new Customer("BB",124));
		set.add(new Customer("CC",125));
		set.add(new Customer("CC",126));
		set.add(new Customer("KK",127));
		set.add(new Customer("GG",1289));
		set.add(new Customer("HH",1239));
		
		for(Object i:set){
			System.out.println(i);
		}
		
	}
}

/*//����TreeSet�����Person��Ķ���ʱ�����ݴ˷�����ȷ�������ĸ��������С�
@Override
public int compareTo(Object o){
	if(o instanceof Person){
		Person p = (Person)o;
		int i = this.age.compareTo(p.age);//�Ȱ���age����
		if(i==0){
			return this.name.compareTo(p.name);
		}else{
			return i;
		}
	}
	return 0;
}*/
