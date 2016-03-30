package com.crm.utils;

import java.security.MessageDigest;

import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.util.Date;
import java.util.UUID;

import org.omg.CORBA.PUBLIC_MEMBER;

//对用户的密码进行md5加密
public class ServiceUtils {
	static char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
     public static String md5(String message){
    	 try {
    		 byte[] btInput = message.getBytes();
             // 获得MD5摘要算法的 MessageDigest 对象
             MessageDigest mdInst = MessageDigest.getInstance("MD5");
             // 使用指定的字节更新摘要
             mdInst.update(btInput);
             // 获得密文
             byte[] md = mdInst.digest();
             // 把密文转换成十六进制的字符串形式
             int j = md.length;
             char str[] = new char[j * 2];
             int k = 0;
             for (int i = 0; i < j; i++) {
                 byte byte0 = md[i];
                 str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                 str[k++] = hexDigits[byte0 & 0xf];
             }
             return new String(str);
    	 } catch (NoSuchAlgorithmException e) {
		throw new RuntimeException();
		}
     }
     
   //产生唯一ID
     public static String generateID(){
     	return UUID.randomUUID().toString();
     }
     
     public static String localDate(){
    	  Date nowdate = new Date();
			DateFormat d8 = DateFormat.getDateTimeInstance();
			String  date = d8.format(nowdate);
			return date;
     }
 }

