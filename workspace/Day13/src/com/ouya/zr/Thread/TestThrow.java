package com.ouya.zr.Thread;

public class TestThrow {

	public static void main(String[] args) {
		try{
			throw new Exception("�Լ�������");
		}catch(Exception e){
//			�����쳣
			System.out.println(e);
		}
	}
}
