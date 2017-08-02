package com.ouya.zr.io;
/**
 * 显示一个文件夹下的所有文件（包括子文件）；
 */
import java.io.File;

public class ShowDir {

	public static void main(String[] args) {
		File al = new File("e:"+File.separator);
		list(al);
	}
	
	public static void list(File al){
		if(al.isDirectory()){
			File list[] = al.listFiles();//返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。
			if(list!=null){
				for(int i=0;i<list.length;i++){
					list(list[i]);
				}
			}
		}
		System.out.println(al);
	}
}
