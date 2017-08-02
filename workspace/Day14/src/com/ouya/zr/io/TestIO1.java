package com.ouya.zr.io;

import java.io.File;
import java.io.IOException;

/**
 * 删除文件
 * delete();
 * 删除抽象类指定路径的文件
 * @author Administrator
 *exists();判断当前地址是否有要删除的文件
 */

public class TestIO1 {

	public static void main(String[] args) {
		File f = new File("e:"+File.separator+"test.txt");
		if(f.exists()){
			f.delete();
		}else{
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
