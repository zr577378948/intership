package com.ouya.zr;

public class OverLoad {

	
	
}
class OverLoadTest{
	//����������
	public int getSum(int i,int j){
		return i+j;
	}
	/*//���Ƿ��������أ���Ϊ�����б��ṹ��ͬ
	public int getSum(int c,int d){
		return c+d;
	}*/
	//�Ƿ���������
	public int getSum(int j,int i,int k){
		return i+j+k;
	}
	//����������
	public String getSum(String j,String i){
		return i+j;
	}
}