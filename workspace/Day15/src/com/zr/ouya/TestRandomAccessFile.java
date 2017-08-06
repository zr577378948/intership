package com.zr.ouya;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import org.junit.Test;

/*
 * TestRandomAccessFile(File file,String mode)�������ж�ȡ��������д��Ķ���������ļ��������ļ���File����
 * 
 * �����ʵ��֧�ֶ���������ļ��Ķ�ȡ��д��
 * "r"��ֻ���ķ�ʽ�򿪡�
 * "rw"���Ա��ȡ��д�롣����ļ����в����ڣ����Դ������ļ�
 * �ֽ��������
 * ������뻻�У�������"\r\n"
 */
public class TestRandomAccessFile {
	
	@Test
	public void r(){
		File f = new File("e:"+File.separatorChar+"hello.txt");
		RandomAccessFile ra = null;
		try {
			ra = new RandomAccessFile(f, "r");
			String name = null;
			int age = 0;
			
			byte b[] = new byte[8];//�����������
			//��ȡ�ڶ�����Ϣ��������һ��,����8�ֽڣ�����12�ֽ�
			ra.skipBytes(12);
			for (int i = 0; i < b.length; i++) {
				b[i] = ra.readByte();
			}
			
			name = new String(b);
			age =  ra.readInt();
			System.out.println("������"+ name +"�����䣺"+age);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(ra!=null){
				try {
					ra.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
	}
	
	
	
	

@Test
public void rw(){
	File f = new File("e:"+File.separatorChar+"hello.txt");
	RandomAccessFile ra = null;
	try {
		ra = new RandomAccessFile(f, "rw");//��дģʽ
		String name = null;
		int age = 0;
		name="zhangsan";//����Ϊ8
		age = 101;//����Ϊ4
//		���±��ײ�洢������byte[];
		ra.writeBytes(name);
		ra.writeInt(age);
		
		name = "lisiss";
		age = 11;
		ra.writeBytes(name);
		ra.writeInt(age);
		name = "lisi";
		age = 10;
		ra.writeBytes(name);
		ra.writeInt(age);
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally{if(ra!=null){
		try {
			ra.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}}
}

}