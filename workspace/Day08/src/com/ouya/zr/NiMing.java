package com.ouya.zr;
/**
 * �ɱ�����Ĳ���
	1.��... �ṹ����������+...+�β�����
	2.�ɱ�����βεķ�����ͬ������֮�乹�����ء�
	3.�ɱ�����βδ�0��ʼ�����ޡ�
	4.�ɱ�����βθ�����ʹ��һ�¡�
	5.�ɱ�����ββ��ܷ����β���ǰ��һ�������β���ֻ�ܹ���һ���ɱ�����βΡ�

 * @author Administrator
 *
 */
public class NiMing {

	public static void main(String[] args) {

		NiMing nm = new NiMing();
		nm.hello();
		nm.hello(new String[]{"haha","jajaja","fgdf"});
		nm.hello("dsf","df");
		nm.hello(45, "sefse","efwer","sdf");
	}

	public void hello(String str){
		System.out.println(str);
		
	}
	
	public void hello(String ...str){
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		
	}
	
	public void hello(int a,String ...str){
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]+a);
		}
		
		
	}
	
	public void hello(int a){
		System.out.println(a);
		
	}
}

