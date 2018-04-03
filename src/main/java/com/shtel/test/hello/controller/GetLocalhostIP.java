package com.shtel.test.hello.controller;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * Title: 测试获取本机的IP测试类
 * Description: TestDemo
 * @author: xg.chen
 * @date:2016年11月14日 下午4:07:00
 */
public class GetLocalhostIP {
    /**
     * MethodsTitle: 测试模块
     * @author: xg.chen
     * @date:2016年11月14日 下午5:03:48
     * @version 1.0
     * @param args
     */
    public static void main(String[] args) {
        getLoalhostIP();
    }
    /**
     * MethodsTitle: 获取本机的IP
     * @author: xg.chen
     * @date:2016年11月14日 下午5:03:41
     * @version 1.0
     */
    public static void getLoalhostIP(){
        try {
            Enumeration<?> enumeration=NetworkInterface.getNetworkInterfaces();
            InetAddress ip=null;
            while(enumeration.hasMoreElements()){
                NetworkInterface netInterface = (NetworkInterface) enumeration.nextElement();
                Enumeration<?> addresses = netInterface.getInetAddresses();
                while (addresses.hasMoreElements()) {
                    ip = (InetAddress) addresses.nextElement();
                    System.out.println("服务地址:" + ip.getHostName());
                    if (ip != null && ip instanceof Inet4Address){
                        String ip1=ip.getHostAddress();
                        System.out.println("本机所有的IP地址:"+ip1);
                    } 
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}