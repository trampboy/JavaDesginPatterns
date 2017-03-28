package com.buer.javadesignpatterns.creational.prototype;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by Administrator on 2015/2/10.
 */
public class Client {
    public static void main(String args[]) {
        String request = "buy:";
        try {
            request = URLEncoder.encode(request, "utf-8");
            System.out.println(request);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
