package com.ouya.zr.file;

import java.io.File;

import org.junit.Test;

/**
 * java.io.File��
 * 1.���������������ص��ࡢ�ӿڵȶ�����java.io���¡�
 * 2.File��һ���࣬�����й�������������󡣴˶����Ӧ��һ���ļ����ļ�Ŀ¼��
 * 3.File�������ƽ̨�޹صġ�
 * 4.File�еķ��������漰��������ɾ�����������ȣ�ֻҪ�漰�ļ����ݵģ�File����Ϊ����ֻ����IO����ɡ�
 * 5.File��Ķ�����Ϊio���ľ�����Ĺ��������βΡ�
 * 
 * 
 * 
 * ����ķ�����getName()
		 getPath()
		 getAbsoluteFile()
		 getAbsolutePath()
		 getParent()
		 renameTo(File newName)
 * @author Administrator
 *
 */
public class TestFile {
/*
 * ·����
 * ����·���������̷����ڵ������ļ�·��
 * ���·�����ڵ�ǰ�ļ�Ŀ¼�µ��ļ�Ŀ¼
 */
	@Test
	public void test1(){
		File f = new File("e:"+File.separator+"qqq.txt");
		File f1 = new File("e:"+File.separator+"q232q.txt");
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println(f.getAbsoluteFile());
		System.out.println(f.getParent());
		System.out.println(f.getAbsolutePath());
		
//		 renameTo(File newName)
		boolean a = f.renameTo(f1);
		System.out.println(a);
	}
}