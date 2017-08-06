package com.ouya.zr.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;
/**
 * ʹ��FileReader FileWriter����ʵ���ı��ļ��ĸ���
 * ���ڷ��ı��ļ�����Ƶ�ļ�����Ƶ�ļ���ͼƬ�ļ�����ֻ��ʹ���ֽ���
 * @author Administrator
 *
 */
public class TestFileReaderWriter {
	/*
	 * FileReader,FileWriterʵ���ļ��ĸ���
	 */
	
	@Test
	public void testFileWrite(){
		File src = new File("e:"+File.separator+"hello.txt");
		File desc = new File("e:"+File.separator+"hello1.txt");
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader(src);
			fw = new FileWriter(desc,true);
			
			char []c = new char[24];
			int len;
			while((len=fr.read(c))!=-1){
				fw.write(c, 0, len);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(fw!=null){
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fr!=null){
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	/*
	 * FilerReaderʵ���ļ��Ķ�ȡ
	 */
	@Test
	public void testFilerReader(){
		FileReader fr = null;
		File f = new File("e:"+File.separator+"hello.txt");
		try {
			fr = new FileReader(f);
			
			char c[] = new char[24];
			int len;
			while((len=fr.read(c))!=-1){
				String str = new String(c, 0, len);
				System.out.println(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(fr!=null){
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}