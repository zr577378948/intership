package com.ouya.zr.io;

import java.io.File;

/**
 * 创建目录（文件夹） mkdir()创建抽象类的制定目录
 * 
 * 可以列出目录里的所有内容：File: 1.以字符串数组列出:list(); 2.以File数组形式列出listFile();
 * 
 * @author Administrator
 *
 */
public class TestDemo2 {

	public static void main(String[] args) {

		File f = new File("e:" + File.separator + "空文件夹");
		f.mkdir();

		File f1 = new File("e:\\视频" + File.separator);
		
		//两种文件目录显示效果
		/*
		 * String str[] = f1.list();
		 * for(int i=0;i<str.length;i++){
		 * System.out.println(str[i]); }
		 */

		/*File fi[] = f1.listFiles();
		for(int i=0;i<fi.length;i++){
			 System.out.println(fi[i]); 
			 }*/
		File fi[] = f1.listFiles();
		for(int i=0;i<fi.length;i++){
			 System.out.println(fi[i]); 
			 }
	}
}
