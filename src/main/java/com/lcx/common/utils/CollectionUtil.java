package com.lcx.common.utils;

import java.util.Collection;

public class CollectionUtil {
	/**
	 * 
	 * @Title: hasValue 
	 * @Description: �жϼ����Ƿ���ֵ������
	 * @return
	 * @return: boolean
	 */
	public static boolean isEmpty(Collection<?> collection) {
		return collection==null || collection.isEmpty();
		//return collection==null || collection.size()==0;
	}
		

}
