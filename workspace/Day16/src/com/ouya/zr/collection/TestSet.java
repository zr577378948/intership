package com.ouya.zr.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * set�ӿڣ��洢˳������(���������)�����ظ�
 * 		  �����ԣ�������������ָ����Ԫ���ڵײ�洢��λ���������
 * 		 �����ظ��ԣ�����Set�������ͬ��Ԫ�ص�ʱ�򣬺�������Ԫ�ز�����ӽ�ȥ
 * 	˵����Ҫ����ӽ�Set�е�Ԫ�����ڵ��࣬һ��Ҫ��дequals()��hashCode(),������֤�����ظ���
 * 
 * setԪ�ش洢�ķ�ʽ��ʹ���˹�ϣ�㷨��
 * 	����set����Ӷ���ʱ�����ȵ��ö����������hashCode����������˶���Ĺ�ϣֵ���˹�ϣֵ�����˴˶�����Set�д洢��λ�ã�
 * ����λ��֮ǰû�ж���洢�����������ֱ�Ӵ洢����λ�á�����λ�����ж���洢����ͨ��equals()�Ƚ������������Ƿ���ͬ��
 * �����ͬ����һ������Ͳ�������ӽ���������hashCode()��equals()ֵ��ͬ��
 * 
 * LinkHashSet:ʹ������ά����һ����ӽ������е�˳�򡣵��µ����Ǳ���LinkedHashSet����Ԫ��ʱ���ǰ�����ӽ�ȥ��˳������ġ�
 */
public class TestSet {

	public static void main(String[] args) {
		String str = "���";
		String str1 = "�����";
		String str2 = "�ܺ�";
		System.out.println(str==str1);//��ֵ
		
		String Str = new String("����");
		String Str1 = new String("�����");
		String Str2 = new String("лл");
		System.out.println(Str==Str1);//�ȵ�ַ
		
		Set set = new HashSet<>();
		set.add(str);
		set.add(str1);
		set.add(str2);
		
		set.add(Str);
		set.add(Str1);
		set.add(Str2);
		System.out.println(set);
		
		set.remove(Str1);
		
		//ʹ����ߵ�Iterator���������ü����еĵ�������������Ϊ�˱����������
		
		Iterator i = set.iterator();
		
		//hasNext();ѭ�������һ��
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}
