package com.shtel.test.hello.controller;
import java.io.*;
import java.util.*;
import java.net.*;

public class GetIP {
    public static void main (String[] args) throws Exception {
        /*
        String s = InetAddress.getLocalHost().toString();
        System.out.println(s);
        
        String[] arr = s.split("/");
        System.out.println("host name:\n" + arr[0]);
        System.out.println("localhost IP:\n" + arr[1]);
        
        */
        Enumeration e = NetworkInterface.getNetworkInterfaces();
        while(e.hasMoreElements()) {
            NetworkInterface n = (NetworkInterface) e.nextElement();
            Enumeration ee = n.getInetAddresses();
            while (ee.hasMoreElements()) {
                InetAddress i = (InetAddress) ee.nextElement();
                System.out.println(i.getHostAddress());
            }
        }

    }
    
    
}