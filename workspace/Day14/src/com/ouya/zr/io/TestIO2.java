package com.ouya.zr.io;

import java.io.File;

/**
 * �ж�һ��������·���Ƿ���Ŀ¼
 * isDirectory()
 * 
 * �г�ָ��Ŀ¼��ȫ���ļ����������ļ���
 * ��ʾ����Ҫ��̬��ͨ�÷���
 * @author Administrator
 *
 */
public class TestIO2 {

	public static void main(String[] args) {
		
		File f = new File("e:"+File.separator);
		if (f.isDirectory()) {
			System.out.println(f.getPath()+"��Ŀ¼");
		}else{
			System.out.println(f.getPath()+"����Ŀ¼");
		}
	}
}
