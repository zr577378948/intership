package com.ouya.zr.collection;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		Student stu = new Student("zhangsan",23,"xian");
		Student stu1 = new Student("lisi",23,"xian");
		Student stu2 = new Student("wangwu",23,"xian");
		//����
		 List st = new ArrayList();
		 st.add(stu);
		 st.add(stu1);
		 st.add(stu2);
		 
		 System.out.println(st);
		 
		 //ɾ��
		 st.remove(0);//ɾ���±�0
		 st.remove(stu1);
		 System.out.println(st);
		 
		 //�޸�
		 st.set(1, stu2);
		 System.out.println(st);
		 
		 //��ѯ
		 for (int i = 0; i < st.size(); i++) {
			 System.out.println(st.get(i));
			
		}
	}
}
