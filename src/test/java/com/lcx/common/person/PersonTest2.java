package com.lcx.common.person;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lcx.common.utils.RandomUtil;
import com.lcx.common.utils.StringUtil;

public class PersonTest2 {

	@Test
	public void test() {
 Person p = new Person();
		 
		 for(int i=0;i<=10000;i++) {
			 String name = StringUtil.generateChineseName();
			 int age = RandomUtil.random(1, 120);
			 String about = StringUtil.randomChineseString(140);
			 p.setName(name);
			 p.setAge(age);
			 p.setAbout(about);
			 System.out.println(p);
		 }
	}

}
