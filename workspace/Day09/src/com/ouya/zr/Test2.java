package com.ouya.zr;

public class Test2 {

	public static void main(String[] args) {
		Girl g = new Girl("lili");
		Boy b = new Boy("tom", 25);
		g.marry(b);

	}

}
class Girl{
	private String name;

	public Girl(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void marry(Boy boy){
	
		System.out.println("女孩："+name+",男孩"+boy.getName()+"男孩女孩在一起了");
	}
}

class Boy{
	private String name;
	int age;
	
	public Boy(String name,int age){
		this.name = name;
		this.age = age;
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
	
public void marry(Girl girl){
	}

public void shout(){
	
}
}

