package com.ouya.zr.bank;

public class User {

	private int id;
	private int password;
	private double money;
	
	public User() {
		super();
	}
	public User(int id, int password, double money) {
		super();
		this.id = id;
		this.password = password;
		this.money = money;
	}
	public User(int id, int password) {
		super();
		this.id = id;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", money=" + money + "]";
	}

	
	
}
