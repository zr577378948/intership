package com.ouya.zr.Thread;

import org.junit.Test;

/**
 * 创建一个子线程，完成1-100之间的自然数的输出。同样地，主线程执行同样的操作
 * 创建多线程的第一种方式：继承java.lang.Thread类
 * @author Administrator
 *
 */

//1.创建一个集成于Thread的子类
class SubThread extends Thread{
	//2.重写Thread类的run()方法,方法内实现此子线程要完成的功能
	@Override
	public void run() {
		for (int i = 0; i <=100; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			
		}
	}
}
public class TestThread {
	public static void main(String[] args) {
//		3.创建一个子类的对象
		SubThread st = new 	SubThread();
//		4.调用线程的start()方法：启动子线程，调用相应的run()方法
//		5.一个线程只能执行一次start()方法 
		st.start();
		for (int i = 0; i <=100; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			
		}
	}
	
	
	@Test
	public void test(){
		
	}

}
