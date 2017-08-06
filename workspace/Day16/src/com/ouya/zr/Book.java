package com.ouya.zr;

public class Book {
private String title;
private double money;
public Book() {
	super();
}
public Book(String title, double money) {
	super();
	this.title = title;
	this.money = money;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public double getMoney() {
	return money;
}
public void setMoney(double money) {
	this.money = money;
}
@Override
public String toString() {
	return "Book [title=" + title + ", money=" + money + "]";
}


}
