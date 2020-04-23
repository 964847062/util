package com.lcx.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		//String str = null; //没值
		//String str = "";//没值
		//String str = " ";//有值
		String str = "abc";//有值
		boolean b = StringUtil.hasLength(str);
		System.out.println(b);
	}
	@Test
	public void testHasText() {
		//String str = "";//没值
	//	String str = "";//没值
		String str = " ";//没值
		boolean b = StringUtil.hasText(str);
		System.out.println(b);	
	}

	@Test
	public void testRandomChineseString() {
		/*
		 * String string = StringUtil.randomChineseString(); System.out.println(string);
		 */
		String string = StringUtil.randomChineseString(500);
		System.out.println(string);
		
	}

	@Test
	public void testGenerateChineseName() {
		String string = StringUtil.generateChineseName();
		System.out.println(string);
	}
	
	
	@Test
	public void testEmail() {
		boolean b = StringUtil.isEmail("964847062@qq.com");
		System.out.println(b);
	}
	
	@Test
	public void testPhone() {
		boolean b = StringUtil.isPhone("18358737074");
		System.out.println(b);
	}
	

	@Test
	public void testNumber() {
		boolean b = StringUtil.isNumber("111");
		System.out.println(b);
	}
	
	@Test
	public void testUrl() {
		//String url="https://www.baidu.com/";
		String url="://www.baidu.com/";
		boolean b = StringUtil.isHttpUrl(url);
		if(b) {
			System.out.println("url合法");
		}else {
			System.out.println("url不合法");
		}
	
	}
	
}
