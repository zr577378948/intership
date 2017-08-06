package com.ouya.zr.collection;
import java.util.List;
import java.util.ArrayList;

/*
 * ArrayList：List的主要实现类
 * 
 * List中此昂对于Collection，新增加的方法
 * 	void add(int index,Object ele):在指定的索引位置添加元素ele
 * 	boolean addAll(int index,Collection eles)：在指定的索引位置加上u、以集合的形式出现的好几个元素
 *	Object get(int index):获得下标为index的元素
 * 	int indexOf(Object obj):返回obj在集合中首次出现的位置，没有的话，返回-1。
 *	int lastIndexOf(Object obj) ：返回obj在集合中最后一次出现的位置，没有的话，返回-1。
 * 	Object remove(int index)：删除指定索引位置的元素
 * 	Object set(int index,Object ele):修改指定索引位置的元素
 *	List subList(int formIndex,int toIndex)：返回从fromIndex到toIndex结束的一个子list,左闭右开
 *
 *	List常用的方法：增(add(Object obj))  删(remove)   改(set(int index,Object obj))
 *				查(get(int index))  插(add(int index,Object ele))   长度(size())
 *
 */
import org.junit.Test;

public class TestList {

	@Test
	public void testArrayList(){
		List list = new ArrayList();
		list.add(123);
		list.add(456);
		list.add(new String("AA"));
		list.add(new String("GG"));
		System.out.println(list);
		list.add(0,555);
		System.out.println(list);
		
		Object obj = list.get(1);
		System.out.println(obj);
		list.remove(0);
		System.out.println(list);
		list.set(0, 111);
		System.out.println(list);
		
		List list1 = list.subList(0, 3);
		System.out.println(list1);
	}
}
