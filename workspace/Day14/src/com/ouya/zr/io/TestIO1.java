package com.ouya.zr.io;

import java.io.File;
import java.io.IOException;

/**
 * ɾ���ļ�
 * delete();
 * ɾ��������ָ��·�����ļ�
 * @author Administrator
 *exists();�жϵ�ǰ��ַ�Ƿ���Ҫɾ�����ļ�
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