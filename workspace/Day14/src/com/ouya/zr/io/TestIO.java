package com.ouya.zr.io;

import java.io.File;
import java.io.IOException;

/**
 * io���Ǹ�ʲô�ģ�
 * �����豸֮������ݴ��䣬Java�ж����ݲ�������ͨ�����ķ�ʽ��Java���������Ķ�����io���С�
 * �������������������ڴ��豸����
 * ����������ݶ�ȡ���ڴ������
 * ���ڴ�д�뵽��������
 * ����������Ϊ���֣��ֽ������ַ���
 * 
 * ������io�����У����ļ��йص�File�࣬ʹ��File���д�����ɾ���ļ��Ȳ�����
 * 
 * 
 *File(String pathname) 
          ͨ��������·�����ַ���ת��Ϊ����·����������һ���� File ʵ����
 *
 */

public class TestIO {

	public static void main(String[] args) {
		
//		File f = new File("e:\\test.txt");//ʵ����File����
		
		File f = new File("e:"+File.separator+"df.txt");
//		f.createNewFile();  �����䷽������������throws�쳣
//		ʹ�÷����������쳣
		
		try {
			f.createNewFile();//�����ļ� ���ݸ�����·��
		} catch (IOException e) {
			e.printStackTrace();//����쳣��Ϣ
		} 
		System.out.println("�ļ��Ѿ������ɹ�");
		System.out.println(File.separator);//���б��
		System.out.println(File.pathSeparator);//���þ�̬����
	}
	
	
}
/**
 * windowsʹ�õ��ļ���б�ܡ�\��
 * Linuxʹ�õġ�/��
 * 
 * separator:"\"ϵͳ�ṩ���ǵĸܣ����ݲ�ͬ��ϵͳд�Ĳ�һ����
 */

