package com.ouya.zr.collection;
import java.util.List;
import java.util.ArrayList;

/*
 * ArrayList��List����Ҫʵ����
 * 
 * List�д˰�����Collection�������ӵķ���
 * 	void add(int index,Object ele):��ָ��������λ�����Ԫ��ele
 * 	boolean addAll(int index,Collection eles)����ָ��������λ�ü���u���Լ��ϵ���ʽ���ֵĺü���Ԫ��
 *	Object get(int index):����±�Ϊindex��Ԫ��
 * 	int indexOf(Object obj):����obj�ڼ������״γ��ֵ�λ�ã�û�еĻ�������-1��
 *	int lastIndexOf(Object obj) ������obj�ڼ��������һ�γ��ֵ�λ�ã�û�еĻ�������-1��
 * 	Object remove(int index)��ɾ��ָ������λ�õ�Ԫ��
 * 	Object set(int index,Object ele):�޸�ָ������λ�õ�Ԫ��
 *	List subList(int formIndex,int toIndex)�����ش�fromIndex��toIndex������һ����list,����ҿ�
 *
 *	List���õķ�������(add(Object obj))  ɾ(remove)   ��(set(int index,Object obj))
 *				��(get(int index))  ��(add(int index,Object ele))   ����(size())
 *
 */
import org.junit.Test;

public class TestList {

	@Test
	public void testArrayList(){
		List list = new ArrayList();
		list.add(123);
		list.add(456);
		list.add(new String("AA"));
		list.add(new String("GG"));
		System.out.println(list);
		list.add(0,555);
		System.out.println(list);
		
		Object obj = list.get(1);
		System.out.println(obj);
		list.remove(0);
		System.out.println(list);
		list.set(0, 111);
		System.out.println(list);
		
		List list1 = list.subList(0, 3);
		System.out.println(list1);
	}
}
