package com.ouya.zr;
/**
 * ��˾�г���Ա�����������š�нˮ����������
 * ��Ŀ�������������������š�нˮ�����н��𣬹�������
 * ��������������������У�ͨ��������������������Ա�� ���ԣ� ���������š�нˮ����Ϊ������ 
 * ���������ԣ����������š�нˮ��������Ϊ��������
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Employee em = new Boss("����", "123", 133.0, 232.0);
		em.work();
	}

}

//Ա��
abstract class Employee{
	private String name;
	private String id;
	private double pay;
	
	public Employee(String name,String id,double pay) {
		this.name = name;
		this.id = id;
		this.pay = pay;
	}
	
	public void work(){
		System.out.println("��Ҫ׬Ǯ");
	}
	
}

//����
class Boss extends Employee{

	private double jiangjin;
	public Boss(String name, String id, double pay,double jiangjin) {
		super(name, id, pay);
		this.jiangjin = jiangjin;
	}
	public void work(){
		System.out.println("�๤");
	}
	
}
