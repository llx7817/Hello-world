package cn.art.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

public class MD5 {
	
	public String str2md5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		//确定计算方法
		MessageDigest mDigest = MessageDigest.getInstance("MD5");
		BASE64Encoder base64 = new BASE64Encoder();
		
		//加密后的字符串
		return base64.encode(mDigest.digest(str.getBytes("utf-8")));
				//System.out.println(string);
	}

}
