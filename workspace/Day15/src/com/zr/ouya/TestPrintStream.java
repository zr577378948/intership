package com.zr.ouya;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class TestPrintStream {

	@Test
	public void testPrintStream() throws Exception{
		PrintStream ps = null;//声明打印流对象
		ps = new PrintStream(new FileOutputStream(new File("e:"+File.separator+"hello1.txt")));
		ps.print("hello13231");
	}
}
