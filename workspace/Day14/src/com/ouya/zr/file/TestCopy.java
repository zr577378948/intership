package com.ouya.zr.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class TestCopy {
	@Test
	public void test(){
		long start  = System.currentTimeMillis();
		String src = "C:\\Users\\Administrator\\Desktop\\11.wmv";
		String dest = "C:\\Users\\Administrator\\Desktop\\12.wmv";
		copy(src, dest);
		long end  = System.currentTimeMillis();
		System.out.println("花费的时间为："+(end-start));
	}

	public void copy(String src,String dest){
		
		File f = new File(src);
		File f1 = new File(dest);
		FileInputStream fs = null;
		FileOutputStream fs1 = null;
		
		try {
			
			fs = new FileInputStream(f);
			fs1 = new FileOutputStream(f1);
			
			byte[] b = new byte[1024];
			int len;
			while((len=fs.read(b))!=-1){
				fs1.write(b, 0, len);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(fs!=null){
			 	try {
					fs.close();
				} catch (IOException e) {
					e.printStackTrace();
				}finally{
					if(fs1!=null){
			 	try {
					fs1.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
				}
			}
			
		}
		System.out.println("成功");	}
	
}


