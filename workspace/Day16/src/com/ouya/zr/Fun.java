package com.ouya.zr;

public class Fun {

	public static void main(String[] args) {
		//��������String����
		String string = getName("���");
		System.out.println(string);
		
		//����������
		Book books = getName(new Book("С����",10));
		System.out.println(books);
		
		//���������������
		System.out.println(getName('d'));
	}
	
	/*public static int getName(A a){
		return a;
	}*/
	
	
	/*���ͷ�����A�Զ���ķ���  a�Ǵ���A����β�
	<A>A ����Ϊ���ͷ���
	*/
	public static <A>A getName(A a){
		return a ;
	}
}