package com.ouya.zr.file;

import java.io.File;

import org.junit.Test;

/**
 * java.io.File类
 * 1.凡是与输入输出相关的类、接口等定义在java.io包下。
 * 2.File是一个类，可以有构造器创建其对象。此对象对应着一个文件或文件目录。
 * 3.File类对象与平台无关的。
 * 4.File中的方法，仅涉及到创建、删除、重命名等，只要涉及文件内容的，File无能为力，只能由IO来完成。
 * 5.File类的对象常作为io流的具体类的构造器的形参。
 * 
 * 
 * 
 * 具体的方法：getName()
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
 * 路径：
 * 绝对路径：包括盘符在内的完整文件路径
 * 相对路径：在当前文件目录下的文件目录
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
