package com.ouya.zr;
/**
 * �������
 * ���ںڰ��ϻ���
 * �����ˡ��ڰ�
 * ����������
 * �г�˾������ɲ��
 * �����г�˾������
 * ������ɲ��
 * �ۻ�Աͳ���ջ�СƱ�ķ���
 * �����ۻ�Ա��СƱ
 * ������ͳ���ջ�СƱ
 * ����Ź�����
 * �����㡢��
 * ����������
 * @author Administrator
 *
 */
public class Oop {

	public static void main(String[] args) {
		Animal animal = new Animal();
		
		animal.setName("����");
		animal.setAge(2);
		animal.setSex("Ů");
		System.out.println("������"+animal.getName()+",�Ա�"+animal.getSex()+"�����䣺"+animal.getAge());
		animal.eat();
	}

}

class Animal{
	//����
	String name;
	int age;
	String sex;
	
	//����
	public void eat(){
		System.out.println("����");
	}
	
	public void sleep(){
		System.out.println("˯��");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}