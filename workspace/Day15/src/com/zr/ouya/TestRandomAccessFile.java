package com.zr.ouya;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import org.junit.Test;

/*
 * TestRandomAccessFile(File file,String mode)创建从中读取和向其中写入的对随机访问文件流，该文件由File决定
 * 
 * 此类的实例支持对随机访问文件的读取和写入
 * "r"以只读的方式打开。
 * "rw"打开以便读取和写入。如果文件上尚不存在，则尝试创建该文件
 * 字节流输出：
 * 如果你想换行，请找我"\r\n"
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
			
			byte b[] = new byte[8];//创建数组接收
			//读取第二人信息，跳过第一人,名字8字节，年龄12字节
			ra.skipBytes(12);
			for (int i = 0; i < b.length; i++) {
				b[i] = ra.readByte();
			}
			
			name = new String(b);
			age =  ra.readInt();
			System.out.println("姓名："+ name +"，年龄："+age);
			
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
		ra = new RandomAccessFile(f, "rw");//读写模式
		String name = null;
		int age = 0;
		name="zhangsan";//长度为8
		age = 101;//长度为4
//		记事本底层存储数据是byte[];
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
