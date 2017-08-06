package com.zr.ouya;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/*
 * 字符流，字节流  输入输出操作
 * 
 * 在字节里的操作：OutputStream输出操作     InputStream输入操作
 * 在字符流里的操作：writer 输出操作  reader 输入操作
 * 
 * 操作流程：
 * 以文件操作为例：
 * 1.以File找到文件的路径
 * 2.通过字节流或字符流的子类来进行指定文件的输出位置
 * 3.进行读/写操作
 * 4.关闭输入/输出
 * 字节流输出：
 * 如果你想换行，"\r\n"
 */
public class TestOutputStream {
	public static void main(String[] args) {
		File f = new File("e:"+File.separatorChar+"hello.txt");
		try {
			OutputStream ot = new FileOutputStream(f, true);
			String str = "\r\nhelloworld";
			byte []b = str.getBytes();
			for (int i = 0; i < b.length; i++) {
				ot.write(b[i]);
			}
			ot.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
