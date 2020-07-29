package com.itheima.utils;

import java.security.MessageDigest;

import org.apache.commons.codec.binary.Base64;


public class MD5Util {

    /**
     * 密码加密
     * @param password
     * @return
     * @throws Exception
     */
    public static String  md5(String password){
        try {
            //1.创建加密对象
            MessageDigest md5 = MessageDigest.getInstance("md5");
            //2.加密密码
            byte[] by = md5.digest(password.getBytes());

            //4.对结果编码
            return Base64.encodeBase64String(by);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}