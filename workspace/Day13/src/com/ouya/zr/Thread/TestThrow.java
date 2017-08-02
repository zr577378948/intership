package com.ouya.zr.Thread;

public class TestThrow {

	public static void main(String[] args) {
		try{
			throw new Exception("自己闹着玩");
		}catch(Exception e){
//			捕获异常
			System.out.println(e);
		}
	}
}
