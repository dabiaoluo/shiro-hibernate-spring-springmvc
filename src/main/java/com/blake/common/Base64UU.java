package com.blake.common;

import org.apache.shiro.codec.Base64;

public class Base64UU {
	/**
	 * ����
	 * @param word
	 * @return
	 */
	public static String setString(String word){
		String base64Encoded = Base64.encodeToString(word.getBytes());//����
		return base64Encoded;
	}
	
	/**
	 * ����
	 * @param pass
	 * @return
	 */
	public static String getString(String pass){
		String str2 = Base64.decodeToString(pass);//��ԭ
		return str2;
	}
	public static void main(String[] args) {
		String s1 = setString("123456");
		System.out.println(s1);
	}
}
