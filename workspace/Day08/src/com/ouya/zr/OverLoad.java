package com.ouya.zr;

public class OverLoad {

	
	
}
class OverLoadTest{
	//方法的重载
	public int getSum(int i,int j){
		return i+j;
	}
	/*//不是方法的重载，因为参数列表结构相同
	public int getSum(int c,int d){
		return c+d;
	}*/
	//是方法的重载
	public int getSum(int j,int i,int k){
		return i+j+k;
	}
	//方法的重载
	public String getSum(String j,String i){
		return i+j;
	}
}
