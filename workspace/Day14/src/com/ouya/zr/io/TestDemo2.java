package com.ouya.zr.io;

import java.io.File;

/**
 * ����Ŀ¼���ļ��У� mkdir()������������ƶ�Ŀ¼
 * 
 * �����г�Ŀ¼����������ݣ�File: 1.���ַ��������г�:list(); 2.��File������ʽ�г�listFile();
 * 
 * @author Administrator
 *
 */
public class TestDemo2 {

	public static void main(String[] args) {

		File f = new File("e:" + File.separator + "���ļ���");
		f.mkdir();

		File f1 = new File("e:\\��Ƶ" + File.separator);
		
		//�����ļ�Ŀ¼��ʾЧ��
		/*
		 * String str[] = f1.list();
		 * for(int i=0;i<str.length;i++){
		 * System.out.println(str[i]); }
		 */

		/*File fi[] = f1.listFiles();
		for(int i=0;i<fi.length;i++){
			 System.out.println(fi[i]); 
			 }*/
		File fi[] = f1.listFiles();
		for(int i=0;i<fi.length;i++){
			 System.out.println(fi[i]); 
			 }
	}
}
