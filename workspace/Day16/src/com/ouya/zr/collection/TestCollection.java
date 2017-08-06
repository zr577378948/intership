package com.ouya.zr.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

/*
 * 1.存储对象可以考虑1.数组，2.集合
 * 2.数组存储对象的特点：Student[] stu = =new Student[20];stu[0] = new Student();...
 * 弊端：1.一旦创建，长度不可变
 * 		2.真实的数组 存放的对象的个数不可知。只能自己实现。
 * 3.集合
 * 		Collection接口
 * 			|-----List接口：存储有序的，可以重复的元素
 * 				|-----ArrayList(主要的实现类)、LinkedList(对于频繁的插入、删除操作)、Vector(古老的实现类、线程安全的，但效率要低于ArrayList)
 * 			|-----Set接口：存数无序的、不可重复的元素，常用的方法都是Collection下定义的
 * 				|-----HashSet(主要实现类)、LinkedHashSet、TreeSet
 * 		Map接口：存储”键-值“对的数据
 * 			|-----HashMap、LinkedHashMap、TreeMap、Hashtable(子类：Properties)
 * 
 */
public class TestCollection {
	
	/*@Test
	public void testCollection1(){
		Collection coll = new ArrayList();
		//size();返回集合中元素的格式
		System.out.println(coll.size());
		//add();向集合中添加元素
		coll.add(24);
		coll.add("sdf");
		coll.add(new Date());
		System.out.println(coll);
		//addAll(Collection coll);将形参coll中包含的所有元素添加到当前集合中
		Collection coll1 = Arrays.asList(1,2,3);
		coll.addAll(coll1);
		System.out.println(coll);
		//isEmpty();判断集合是否为空
		System.out.println(coll.isEmpty());
		//clear();清空集合元素
		coll.clear();
		System.out.println(coll);
		 
	}*/
/*	
	@Test
	public void testCollection2(){
		Collection coll = new ArrayList();
		coll.add(24);
		coll.add(123);
		coll.add("sdf");
		coll.add(new Date());
		System.out.println(coll);
		//contains(Object obj);判断集合中是否包含指定obj元素，如果包含，返回true，否则返回false
		//判断的依据：根据元素所在类的equals()方法进行判断。
		//明确：如果存入集合中的元素是自定义类的对象。要求：自定义类要重写equals()方法。
		boolean b1 = coll.contains(123);
		System.out.println(b1);
		//containsAll(Collection coll);判断当前集合中是否包含coll中所有的元素
		Collection coll1 = new ArrayList();
		coll1.add(123);
		coll1.add(new String("AA"));
		boolean b3 = coll.containsAll(coll1);
		System.out.println("#"+b3);
		//retainAl;(Collection coll);求当前集合与coll的共有元素，返回给当前集合
		coll1.retainAll(coll);
		System.out.println("共同的元素："+coll1);
		//remove(Object obj);删除集合中的obj元素，若删除成功，返回true
		boolean b4 = coll.remove("hah");
		System.out.println(b4);
		
		
	}*/
	
	@Test
	public void testConnection(){
		Collection coll = new ArrayList();
		coll.add(24);
		coll.add(123);
		coll.add("sdf");
		coll.add(45);
		
		Collection coll1 = new ArrayList();
		coll1.add(123);
		coll1.add(new String("AA"));
		//removeAll(Collection coll);从当前集合中删除包含在coll中的元素
		coll.removeAll(coll1);
		System.out.println(coll);
		//equals(Object obj);判断集合中的所有元素是否完全相同
		Collection coll2 = new ArrayList();
		coll2.add(123);
		coll2.add(new String("AA"));
		System.out.println(coll1.equals(coll2));
		//hasCode();
		System.out.println(coll.hashCode());
		//toArray();将集合转换为数组
		Object[] obj = coll.toArray();
		for (int s = 0; s < obj.length; s++) {
			System.out.println(obj[s]);
		}
		
		//iterator();遍历集合元素，返回一个Iterator接口实现类的对象
		Iterator i = coll.iterator();
		/*for (int j = 0; j < coll.size(); j++) {
			System.out.println(i.next());
		}*/
		while(i.hasNext()){
			System.out.println(i.next());
			
		}
	}
	
	
}
