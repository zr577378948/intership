package com.ouya.zr;
/**
 * ��д��ʦ���ѧ���࣬��ͨ�������ഴ��������в���
 * ѧ����
 * ���ԣ����������䡢�μӵĿγ̡���Ȥ
 * ��������ʾѧ���ĸ�����Ϣ
 * ��ʦ��
 * ���ԣ�������רҵ�����ڵĿγ̡�����
 * ��������ʾ��ʦ�ĸ�����Ϣ
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {

		Student s = new Student();
		s.show();
		Teacher t = new Teacher();
		t.show();
	}
	
}	
class Student{
		//����
		String name = "����";
		int age = 45;
		String kecheng = "�٤";
		String hobby = "����";
		
		//����
		public void show(){
			System.out.println("������"+name+",���䣺"+age+",�μӵĿγ�:"+kecheng+",��Ȥ��"+hobby);
		}
	}

class Teacher{
	//����
	String name = "����";
	String major = "����";
	String kecheng = "��ѧ";
	int age = 45;
	//����
	public void show(){
		System.out.println("������"+name+",רҵ:"+major+",�γ̣�"+kecheng+"���䣺"+age);
	}
}

