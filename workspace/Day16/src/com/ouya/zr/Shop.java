package com.ouya.zr;

import java.util.Arrays;

/*
 * ����:�ڽ�������ʱ��ָ������������ԣ�������ʵ�����������ⲿ�����趨�����Ϳ���������ݰ�ȫ��
 * ԭ����������ʱͨ����ʶ����ʾ���е�ĳ���������ͣ���ĳ�����ķ���ֵ���ο����͡�
 * ʵ������ʱֻҪָ����Ҫ���ͼ���
 * 
 * 
 * ���Ͷ�������Ӧ����㷺���ձ��
 * 
 * 
 * ���Ͷ����巽����
 * �̵�<����> �������� = new �̵�<����>();
 * 
 */
public class Shop {

}

class Store<E>{
	private E[] room;
	private int[] num;
	public Store() {
		super();
	}
	public Store(E[] room, int[] num) {
		super();
		this.room = room;
		this.num = num;
	}
	public E[] getRoom() {
		return room;
	}
	public void setRoom(E[] room) {
		this.room = room;
	}
	public int[] getNum() {
		return num;
	}
	public void setNum(int[] num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Store [room=" + room + ", num=" + num + "]";
	}
	public void show(){
		for (E b:room) {
			System.out.println(b);
		}
	}
	
}