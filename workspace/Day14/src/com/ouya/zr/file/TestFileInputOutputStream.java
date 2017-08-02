package com.ouya.zr.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class TestFileInputOutputStream {

	/*
	 * �Ӽ���д��һ���ֽڶ�ȡ�����ļ�
	 */
	
	@Test
	public void FileInputOutOutStream1(){
		File f1 = new File("e:"+File.separator+"hello4.txt");
		File f = new File("e:"+File.separator+"hello4.txt");
		
		
		FileOutputStream fs1 = null;
		FileInputStream fs = null;
		try {
			fs1 = new FileOutputStream(f1);
			fs = new FileInputStream(f);
			fs1.write(new String("jkhkajshfjka").getBytes());
			
			byte[] b = new byte[20];
			int len;
			while((len=fs.read(b))!=-1){
				String str = new String(b, 0, len);
				System.out.println(str);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(fs1!=null){
	 	try {
			fs1.close();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
		
			if(fs!=null){
			 	try {
					fs.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
		}
	}
	
	
	/*
	 * �Ӽ��̶�ȡһ���ļ����ڸ��ļ�д���ֽڣ��൱�ڸ����ļ������ݣ�
	 */
	@Test
	public void FileInputOutOutStream(){
		File f = new File("e:"+File.separator+"hello2.txt");
		File f1 = new File("e:"+File.separator+"hello3.txt");
		FileInputStream fs = null;
		FileOutputStream fs1 = null;
		
		try {
			
			fs = new FileInputStream(f);
			fs1 = new FileOutputStream(f1);
			
			byte[] b = new byte[20];
			int len;
			while((len=fs.read(b))!=-1){
				fs1.write(b, 0, len);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(fs!=null){
			 	try {
					fs.close();
				} catch (IOException e) {
					e.printStackTrace();
				}finally{
					if(fs1!=null){
			 	try {
					fs1.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
				}
			}
			
		}
	}
	
	/*
	 * FileOutputStreamд�ֽ�
	 */
	@Test
	public void FileOutputStream(){
		//����һ��File���󣬱���Ҫд���λ��
		//����������ļ������Բ����ڣ��������ڣ������Զ������������ڣ��Ὣԭ�е��ļ�����
		File f = new File("e:"+File.separator+"hello1.txt");
		//����һ��FileOutputStream���󣬽�f�Ķ�����Ϊ�βδ��ݸ�FileOutputStream��������
		FileOutputStream fs = null;
		try {
			fs = new FileOutputStream(f);
			//д��Ĳ���
			fs.write(new String("hellohaha").getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			//�ر���
			if(fs!=null){
				try {
					fs.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/*
	 * FileInputStream���ֽ�
	 */
	@Test
	public void testFileInputStream3() {

		FileInputStream fs = null;
		try {
			File f = new File("e:"+File.separator+"hello.txt");
			fs = new FileInputStream(f);
			
			byte b[] = new byte[5];//ÿ�ζ�ȡ������Ҫд�������
			int len;//ÿ�ζ�ȡ���ֽڳ���
			while((len=fs.read(b))!=-1){
				/*for (int i = 0; i < len; i++) {
					System.out.println((char)b[i]);
				}*/
				String str = new String(b, 0, len);
				System.out.print(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(fs!=null){
		try {
			fs.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}}

	// ʹ��try-catch�ķ�ʽ���������쳣������:��֤���Ĺرղ����ܹ�������ִ��
	
	@Test
	public void testFileInputStream2() {
		// 1.����һ��File��Ķ���
		// 2.����һ��FileInputStream��Ķ���
		FileInputStream fs = null;
		try {
			File f = new File("e:" + File.separator + "hello.txt");
			fs = new FileInputStream(f);
			// 3.����FileInputStream�ķ�����ȡfile�ļ�
			
// read����ȡ�ļ���һ���ֽڣ���ִ�е��ļ���βʱ������-1
			 
			int b = fs.read();
			while (b != -1) {
				System.out.println((char) b);
				b = fs.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4.�ر���Ӧ����
			if (fs != null) {
				try {
					fs.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	// ��Ӳ�̴��ڵ�һ���ļ��У���ȡ�����ݵ�������,ʹ��FileInputSteam
	// Ҫ��ȡ���ļ�һ��Ҫ���ڣ��������FileNotFoundException�쳣
	@Test
	public void testFileInputStream1() throws Exception {
		// 1.����һ��File��Ķ���
		File f = new File("e:" + File.separator + "hello.txt");
		// 2.����һ��FileInputStream��Ķ���
		FileInputStream fs = new FileInputStream(f);
		// 3.����FileInputStream�ķ�����ȡfile�ļ�
		
//read����ȡ�ļ���һ���ֽڣ���ִ�е��ļ���βʱ������-1
		 
		int b = fs.read();
		while (b != -1) {
			System.out.println((char) b);
			b = fs.read();
		}
		// 4.�ر���Ӧ����
		if (fs != null) {
			fs.close();
		}
	}
}