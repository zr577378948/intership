package com.ouya.zr.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

/*
 * TreeSet：用于提供数据内容排序
 * 1.向TreeSet添加的元素必须是同一个类中的
 * 2.可以按照添加进集合中的元素指定的顺序遍历。像String，包装类等默认按照从小到大的顺序进行遍历
 * 3.当向TreeSet中添加自定义类的对象时，有两种排序方法:1.自然排序2.定制排序
 * 自然排序：要求自定义类实现了java.lang.comparable接口并重写compareTo(Object o),按照自定义的属性排序。
 * 4.向TreeSet中添加元素时，首先按照compareTo（）进行比较，一旦返回0，虽然现实两个对象的此属性值相同，但是程序
 * 会认为两个对象是相同的，进而后一个就不能添加进来。要求compareTo(0与hashCode()以及equals()三者保持一致
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
	 * Customer类
	 * TreeSet的定制排序
	 */
	@Test
	public void testTree(){
		//1.创建一个实现了Comparator接口的类对象
		Comparator  com = new Comparator(){
			//向TreeSet中添加Customer类的对象，在此compare()方法中，指明按照Cuatomer的哪个属性进行排序的。
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
		//2.将此对象作为形参传递给TreeSet的构造器中
		TreeSet set = new TreeSet(com);
		//3.向TreeSet中添加Comparator接口中的compare方法中涉及的类的对象。
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

/*//当向TreeSet中添加Person类的对象时，依据此方法，确定按照哪个属性排列。
@Override
public int compareTo(Object o){
	if(o instanceof Person){
		Person p = (Person)o;
		int i = this.age.compareTo(p.age);//先按照age排序
		if(i==0){
			return this.name.compareTo(p.name);
		}else{
			return i;
		}
	}
	return 0;
}*/
