package com.ouya.zr;

public class ExtendsTest {

	public static void main(String[] args) {

		Student s = new Student();
		s.setName("С��");
		s.setAge(12);
		s.setSchool("�廪");
		System.out.println("������"+s.getName()+", ���䣺"+s.getAge()+"�� ���ϵ�ѧУ��"+s.getSchool());
		
		
		Person p = new Person();
		p.setName("�ϰ�");
		p.setAge(40);
		System.out.println("������"+p.getName()+", ���䣺"+p.getAge()+"�� ̫���ˣ�ѧУ��Ҫ�ˣ�����");
		
		
		
		BigStudent bs = new BigStudent();
		
	}

}

class Person{
	
	private String name;
	private int age;
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
	
	
}

class Student extends Person{
	
	public String School;

	public String getSchool() {
		return School;
	}

	public void setSchool(String school) {
		School = school;
	}
	
	
	
}

class BigStudent extends Person{

	private String love;

	public String getLove() {
		return love;
	}

	public void setLove(String love) {
		this.love = love;
	}
	
}