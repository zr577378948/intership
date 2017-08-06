package TestOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

/*
 * �ֽ������
 * InputStream�����࣬Ҳ������ʵ����
 */
public class TestInputStream {

	public static void main(String[] args) {
		File f = new File("e:"+File.separator+"hello.txt");
		InputStream in = null;
		try {
			in = new FileInputStream(f);
			
			byte []b = new byte[(int)f.length()];
			int len;
			while((len=in.read(b))!=-1){
				String str = new String(b);
				System.out.println(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * �����֪���ļ���С
	 */
	@Test
	public void inputStream(){
		File f = new File("e:"+File.separator+"hello.txt");
		InputStream in = null;
		try {
			in = new FileInputStream(f);
			
			byte []b = new byte[1024];
			int len;//����ÿһ����ȡ�����Ľ���
			while((len=in.read(b))!=-1){
				String str = new String(b);
				System.out.println(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}