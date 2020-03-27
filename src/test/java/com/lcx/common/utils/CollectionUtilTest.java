package com.lcx.common.utils;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class CollectionUtilTest {

	@Test
	public void testIsEmpty() {
		ArrayList<Object> list = new ArrayList<Object>();
		//list.add("aaa");
		//HashMap<String, String> map = new HashMap<String, String>();
		boolean b = CollectionUtil.isEmpty(list);
		System.out.println(b);
	}

}
