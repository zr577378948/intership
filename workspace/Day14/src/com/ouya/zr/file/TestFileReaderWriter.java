package com.ouya.zr.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;
/**
 * 使用FileReader FileWriter可以实现文本文件的复制
 * 对于非文本文件（视频文件，音频文件，图片文件），只能使用字节流
 * @author Administrator
 *
 */
public class TestFileReaderWriter {
	/*
	 * FileReader,FileWriter实现文件的复制
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
	 * FilerReader实现文件的读取
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
