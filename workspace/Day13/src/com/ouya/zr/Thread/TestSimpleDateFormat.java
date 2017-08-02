package com.ouya.zr.Thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormat {

	public static void main(String[] args) throws ParseException {
//		格式化
		SimpleDateFormat s = new SimpleDateFormat();
		String date = s.format(new Date());
		System.out.println(date);
		
		SimpleDateFormat sd = new SimpleDateFormat("EEE,MMM  d  yyy HH:mm:ss Z");
		String date1 = sd.format(new Date());
		System.out.println(date1);
	
//		解析
		Date date2 = s.parse("17-8-1 下午2:22");
//		System.out.println(new Date());
		System.out.println(date2);
	}
}
