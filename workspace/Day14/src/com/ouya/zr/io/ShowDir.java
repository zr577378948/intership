package com.ouya.zr.io;
/**
 * ��ʾһ���ļ����µ������ļ����������ļ�����
 */
import java.io.File;

public class ShowDir {

	public static void main(String[] args) {
		File al = new File("e:"+File.separator);
		list(al);
	}
	
	public static void list(File al){
		if(al.isDirectory()){
			File list[] = al.listFiles();//����һ������·�������飬��Щ·������ʾ�˳���·������ʾ��Ŀ¼�е��ļ���
			if(list!=null){
				for(int i=0;i<list.length;i++){
					list(list[i]);
				}
			}
		}
		System.out.println(al);
	}
}