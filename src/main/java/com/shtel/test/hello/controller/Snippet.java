package com.shtel.test.hello.controller;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class Snippet {
	
	
	public static void main(String[] args) throws Exception {
		Enumeration allNetInterfaces = NetworkInterface.getNetworkInterfaces();
	    InetAddress ip = null;
	    while (allNetInterfaces.hasMoreElements()) {
	        NetworkInterface netInterface = (NetworkInterface) allNetInterfaces.nextElement();
	        System.out.println(netInterface.getName());
	        Enumeration addresses = netInterface.getInetAddresses();
	        while (addresses.hasMoreElements()) {
	            ip = (InetAddress) addresses.nextElement();
	                if (ip != null && ip instanceof Inet4Address) {
	                    System.out.println(ip.getHostAddress());
	                }
	            }
	        }
	    System.out.println("cuowu");
	}
	public static String getLocalIP() throws Exception {
	    Enumeration allNetInterfaces = NetworkInterface.getNetworkInterfaces();
	    InetAddress ip = null;
	    while (allNetInterfaces.hasMoreElements()) {
	        NetworkInterface netInterface = (NetworkInterface) allNetInterfaces.nextElement();
	        System.out.println(netInterface.getName());
	        Enumeration addresses = netInterface.getInetAddresses();
	        while (addresses.hasMoreElements()) {
	            ip = (InetAddress) addresses.nextElement();
	                if (ip != null && ip instanceof Inet4Address) {
	                    return ip.getHostAddress();
	                }
	            }
	        }
	    return "";
	}
}

