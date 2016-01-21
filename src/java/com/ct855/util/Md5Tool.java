package com.ct855.util;

import java.security.MessageDigest;


public class Md5Tool {

    public static String getMd5(String password) {
        String str = "";
        if (password != null && !password.equals("")) {
            try {
                MessageDigest md = MessageDigest.getInstance("MD5");
                Base64 base = new Base64();                
                //加密后的字符串
                str = base.encode(md.digest(password.getBytes("utf-8")));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return str;
    }
}
