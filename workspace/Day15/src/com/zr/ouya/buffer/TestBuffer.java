package com.zr.ouya.buffer;
/*
 * 开发中尽量用缓冲流(Buffer)，不要用节点流(File)，这样会提高效率
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

//使用BuffefedReader和BufferWriter实现非文本文件的复制
	@Test
	public void testBufferedReaderWrite(){
		
		
		BufferedReader  bs = null;
		BufferedWriter  bs1 = null;
		try {
			//1.提供读入写出的文件
			File f = new File("e:"+File.separatorChar+"hello.txt");
			File f1 = new File("e:"+File.separatorChar+"hello1.txt");
			//2.创建相应的节点流FileInputStream、FileOutputStream
			FileReader fs = new FileReader(f);
			FileWriter fs1 = new FileWriter(f1);
			//3.将创建的节点流的对象作为参数传递给缓冲刘的构造器中
			bs = new BufferedReader(fs);
			bs1 = new BufferedWriter(fs1);
			
			//4.具体的实现文件复制的操作
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
	
	
	
//使用BuffefedInputStream和BufferOutputStream实现非文本文件的复制
	
	@Test
	public void testBufferedInputStreamOutputStream(){
		
		
		BufferedInputStream  bs = null;
		BufferedOutputStream  bs1 = null;
		try {
			//1.提供读入写出的文件
			File f = new File("e:"+File.separatorChar+"hello.txt");
			File f1 = new File("e:"+File.separatorChar+"hello1.txt");
			//2.创建相应的节点流FileInputStream、FileOutputStream
			FileInputStream fs = new FileInputStream(f);
			FileOutputStream fs1 = new FileOutputStream(f1);
			//3.将创建的节点流的对象作为参数传递给缓冲流的构造器中
			bs = new BufferedInputStream(fs);
			bs1 = new BufferedOutputStream(fs1);
			
			//4.具体的实现文件复制的操作
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
		bf = new BufferedReader(new InputStreamReader(System.in));//将字节流变成字符流
		String str = null;
		System.out.println("请输入：");
		try {
			str = bf.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//反馈
		System.out.println("我写的是"+str);
	}
}
