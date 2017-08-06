package com.ouya.zr.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * set接口：存储顺序无序(不是随机性)，不重复
 * 		  无序性：真正的无序性指的是元素在底层存储的位置是无序的
 * 		 不可重复性：当像Set中添加相同的元素的时候，后面的这个元素不能添加进去
 * 	说明：要求添加进Set中的元素所在的类，一定要重写equals()和hashCode(),进而保证不可重复性
 * 
 * set元素存储的方式？使用了哈希算法。
 * 	当像set中添加对象时，首先调用对象所在类的hashCode方法，计算此对象的哈希值，此哈希值决定了此对象在Set中存储的位置，
 * 若此位置之前没有对象存储，则这个对象直接存储到此位置。若此位置已有对象存储，再通过equals()比较这两个对象是否相同。
 * 如果相同，后一个对象就不能在添加进来。建议hashCode()与equals()值相同。
 * 
 * LinkHashSet:使用链表维护了一个添加进集合中的顺序。导致当我们遍历LinkedHashSet集合元素时，是按照添加进去的顺序遍历的。
 */
public class TestSet {

	public static void main(String[] args) {
		String str = "你好";
		String str1 = "你好吗？";
		String str2 = "很好";
		System.out.println(str==str1);//比值
		
		String Str = new String("哈哈");
		String Str1 = new String("你好吗？");
		String Str2 = new String("谢谢");
		System.out.println(Str==Str1);//比地址
		
		Set set = new HashSet<>();
		set.add(str);
		set.add(str1);
		set.add(str2);
		
		set.add(Str);
		set.add(Str1);
		set.add(Str2);
		System.out.println(set);
		
		set.remove(Str1);
		
		//使用最高的Iterator方法，调用集合中的迭代器方法，是为了遍历无序对象；
		
		Iterator i = set.iterator();
		
		//hasNext();循环输出下一个
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}
