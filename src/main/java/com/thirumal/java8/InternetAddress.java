package com.thirumal.java8;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InternetAddress {

	public InternetAddress() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws UnknownHostException {
		 System.out.println(InetAddress.getLocalHost());
	}

}
