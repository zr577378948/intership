package com.ouya.zr;

public class Computer {
	private String name;
	private double money;
	public Computer() {
		super();
	}
	public Computer(String name, double money) {
		super();
		this.name = name;
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Computer [name=" + name + ", money=" + money + "]";
	}
	
	
}
