package com.zr.ouya;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

import org.junit.Test;

public class TestOtherStream {
	/*
	 * ��׼������������� ��׼���������System.out ��׼����������System.in
	 * 
	 * ���磺 �Ӽ��������ַ�����Ҫ�󽫶�ȡ���������ַ���ת���ɴ�д�����Ȼ������������������ ֱ�������롰e�����ߡ�exit��ʱ���˳�����
	 */
	@Test
	public void test2() {

		BufferedReader br = null;
		String str;

		try {
			InputStream in = System.in;
			InputStreamReader ir = new InputStreamReader(in);
			br = new BufferedReader(ir);
			while (true) {
				System.out.println("�������ַ�����");
				str = br.readLine();
				if (str.equalsIgnoreCase("e") || str.equalsIgnoreCase("exit")) {
					break;
				} else {
					String str1 = str.toUpperCase();
					System.out.println(str1);
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	/*
	 * ���룺�ַ���--->�ֽ�����(OutputStreamWriter)�� ���룺�ֽ�����--->�ַ���(InputStreamReader)��
	 */
	@Test
	public void testOtherStream() {

		// ����
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			File f = new File("e:" + File.separator + "hello12.txt");
			FileInputStream fi = new FileInputStream(f);
			InputStreamReader is = new InputStreamReader(fi, "GBK");
			br = new BufferedReader(is);

			// ����
			File f1 = new File("e:" + File.separator + "hello121.txt");
			FileOutputStream fo = new FileOutputStream(f1);
			OutputStreamWriter os = new OutputStreamWriter(fo, "GBK");
			bw = new BufferedWriter(os);

			String str;
			while ((str = br.readLine()) != null) {
				bw.write(str);
				bw.newLine();
				bw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	/*
	 * �ֽ���ת��Ϊ�ַ���
	 */
	@Test
	public void demo() throws Exception {
		File f = new File("e:" + File.separator + "hello1.txt");
		Writer out = new OutputStreamWriter(new FileOutputStream(f));
		out.write("zcxc|");
		out.close();

	}

	/*
	 * �ַ���ת��Ϊ�ֽ���
	 */
	@Test
	public void demo1() throws Exception {
		File f = new File("e:" + File.separator + "hello1.txt");
		Reader reader = new InputStreamReader(new FileInputStream(f));
		char c[] = new char[1024];
		int len = reader.read(c);
		System.out.println(new String(c, 0, len));
		reader.close();

	}
}