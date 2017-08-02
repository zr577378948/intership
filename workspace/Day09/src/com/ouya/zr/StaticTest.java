package com.ouya.zr;

/**
 * static 静态的，修饰我们的成员。
特点：1.随着类的加载而加载，优先对象存在。
  	2.被所有的对象公用。
	3.可以被类直接调用。
 * @author Administrator
 *
 */
public class StaticTest {


	{
		
		St s = new St();
		s.age = 4;
		s.info();
		//可以用类名直接调用
		St.age = 5;
		s.info();
	}

}

class St{
	static int age;
	String name;
	
	public void  info(){
		
		System.out.println("name:"+name+",age:" + age);
	}
}