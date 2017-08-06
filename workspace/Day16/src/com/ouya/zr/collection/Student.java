package com.ouya.zr.collection;
/*
 * ����ʹ�ó�����ӿڷ���������ʵ�����ĳ�����
 */
public class Student implements Comparable<Student>{

	private String name;
	private int age;
	private String address;
	public Student() {
		super();
	}
	public Student(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	public int compareTo(Student s){
		if(this.age>s.age){
			return -1;
		}else if(this.age==s.age){
			return 0;
		}else{
			return 1;
		}
	}
	
}
