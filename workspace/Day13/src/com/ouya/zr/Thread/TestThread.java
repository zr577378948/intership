package com.ouya.zr.Thread;

import org.junit.Test;

/**
 * ����һ�����̣߳����1-100֮�����Ȼ���������ͬ���أ����߳�ִ��ͬ���Ĳ���
 * �������̵߳ĵ�һ�ַ�ʽ���̳�java.lang.Thread��
 * @author Administrator
 *
 */

//1.����һ��������Thread������
class SubThread extends Thread{
	//2.��дThread���run()����,������ʵ�ִ����߳�Ҫ��ɵĹ���
	@Override
	public void run() {
		for (int i = 0; i <=100; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			
		}
	}
}
public class TestThread {
	public static void main(String[] args) {
//		3.����һ������Ķ���
		SubThread st = new 	SubThread();
//		4.�����̵߳�start()�������������̣߳�������Ӧ��run()����
//		5.һ���߳�ֻ��ִ��һ��start()���� 
		st.start();
		for (int i = 0; i <=100; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			
		}
	}
	
	
	@Test
	public void test(){
		
	}

}