package com.ouya.zr;
/**
 * 面向对象
 * 人在黑板上画画
 * 对象：人、黑板
 * 方法：画画
 * 列车司机紧急刹车
 * 对象：列车司机、车
 * 方法：刹车
 * 售货员统计收获小票的方法
 * 对象：售货员、小票
 * 方法：统计收货小票
 * 你把门关上了
 * 对象：你、门
 * 方法：关门
 * @author Administrator
 *
 */
public class Oop {

	public static void main(String[] args) {
		Animal animal = new Animal();
		
		animal.setName("花花");
		animal.setAge(2);
		animal.setSex("女");
		System.out.println("姓名："+animal.getName()+",性别："+animal.getSex()+"，年龄："+animal.getAge());
		animal.eat();
	}

}

class Animal{
	//属性
	String name;
	int age;
	String sex;
	
	//方法
	public void eat(){
		System.out.println("吃肉");
	}
	
	public void sleep(){
		System.out.println("睡觉");
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
