package com.ouya.zr;

public class SuperTest {
	
	public static void main(String[] args) {
		
		Person1 p = new Person1("name",12); 
		System.out.println(p.info());;
		
	}
	
	
}

class Person1{
	private String name;
	private int age;
	
	
	//������
	public Person1(String name ,int age){
		this.setName(name);
		this.setAge(age);
		
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
	
	public String info(){//String����   ԭ��ֻ�ǽ�����Ľ��ƴ����������
		return this.getName()+this.getAge();
	}
	
}



class St extends Person1{

	private String school;
	
	//��д����Ĺ��췽��
	public St(String name, int age,String school) {
		//���ø���Ĳ���
		super(name, age);//super��ʹ�ã����ڹ��������У���������ͬ�βεĹ��췽��   
		this.setSchool(school);
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	
	public String info(){
		//return this.getName() + this.getAge() + this.getSchool();
		return super.info() + this.getSchool();//��ø���Ĺ̶�����+��������
	}
	
}

class wo{
	private String work;
}