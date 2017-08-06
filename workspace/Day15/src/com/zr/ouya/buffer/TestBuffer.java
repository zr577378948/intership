package com.zr.ouya.buffer;
/*
 * �����о����û�����(Buffer)����Ҫ�ýڵ���(File)�����������Ч��
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

public class TestBuffer {

//ʹ��BuffefedReader��BufferWriterʵ�ַ��ı��ļ��ĸ���
	@Test
	public void testBufferedReaderWrite(){
		
		
		BufferedReader  bs = null;
		BufferedWriter  bs1 = null;
		try {
			//1.�ṩ����д�����ļ�
			File f = new File("e:"+File.separatorChar+"hello.txt");
			File f1 = new File("e:"+File.separatorChar+"hello1.txt");
			//2.������Ӧ�Ľڵ���FileInputStream��FileOutputStream
			FileReader fs = new FileReader(f);
			FileWriter fs1 = new FileWriter(f1);
			//3.�������Ľڵ����Ķ�����Ϊ�������ݸ��������Ĺ�������
			bs = new BufferedReader(fs);
			bs1 = new BufferedWriter(fs1);
			
			//4.�����ʵ���ļ����ƵĲ���
			char []b = new char[1024];
			
			int len;
			while((len=bs.read(b))!=-1){
			
				bs1.write(b, 0, len);
				bs1.flush();
			}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				if(bs1!=null){
					try {
						bs1.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(bs!=null){
					try {
						bs.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		
	}
	
	
	
//ʹ��BuffefedInputStream��BufferOutputStreamʵ�ַ��ı��ļ��ĸ���
	
	@Test
	public void testBufferedInputStreamOutputStream(){
		
		
		BufferedInputStream  bs = null;
		BufferedOutputStream  bs1 = null;
		try {
			//1.�ṩ����д�����ļ�
			File f = new File("e:"+File.separatorChar+"hello.txt");
			File f1 = new File("e:"+File.separatorChar+"hello1.txt");
			//2.������Ӧ�Ľڵ���FileInputStream��FileOutputStream
			FileInputStream fs = new FileInputStream(f);
			FileOutputStream fs1 = new FileOutputStream(f1);
			//3.�������Ľڵ����Ķ�����Ϊ�������ݸ��������Ĺ�������
			bs = new BufferedInputStream(fs);
			bs1 = new BufferedOutputStream(fs1);
			
			//4.�����ʵ���ļ����ƵĲ���
			byte []b = new byte[1024];
			
			int len;
			while((len=bs.read(b))!=-1){
			
				bs1.write(b, 0, len);
				bs1.flush();
			}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				if(bs1!=null){
					try {
						bs1.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(bs!=null){
					try {
						bs.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		
	}
	
	
	
	
	
	@Test
	public void test(){
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));//���ֽ�������ַ���
		String str = null;
		System.out.println("�����룺");
		try {
			str = bf.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//����
		System.out.println("��д����"+str);
	}
}