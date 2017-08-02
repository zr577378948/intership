package com.ouya.zr;

public class gouzao {
	
	public static void main(String[] args) {
		Person p = new Person();
		p.info();
		Person p1 = new Person("dsf");
		p1.info();
		Person p2 = new Person("dsf",5);
		p2.info();
	}
}
class Person{
	String name ;
	int age ;
	
	//无参构造器
	public Person(){
		System.out.println("kndfk"); ;
	}
	
	//有参构造器
	public Person(String a){
		name = a ;
	}
	public Person(String a,int g){
		name = a ;
		age = g;
	}
	public void info(){
		System.out.println("name:"+ name +",age:"+age);
	}
}