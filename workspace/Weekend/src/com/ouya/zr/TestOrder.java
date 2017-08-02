package com.ouya.zr;

public class TestOrder {

	public static void main(String[] args) {
		
		Order o1 = new Order(1001, "AA");
		Order o2 = new Order(1001, "AA");
		System.out.println(o1 == o2);//false
		System.out.println(o1.equals(o2));//false
		
	}
	
}

class Order{
	private int  orderId;
	private String orderName;
	
	public Order(int orderId,String orderName){
		this.orderId = orderId;
		this.orderName = orderName;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	//比较两个Order对象的属性是否完全相同。如果相同，返回true
	public boolean equals(Object obj){
		if(this == obj){
		return true;}
		else if(obj instanceof Order){
			Order o1 = (Order)obj;
			return this.orderId == o1.orderId && this.orderName.equals(o1.orderName);
		}else{
			return false;
		}
		
	}
}
