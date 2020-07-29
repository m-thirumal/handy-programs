/**
 * 
 */
package com.thirumal.io;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Thirumal
 *
 */
public class SystemName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InetAddress addr = null;
		try {
			addr = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    String hostname = addr.getHostName();
	    System.out.println("hostName: "+ hostname);
	    Map<String, Object[]> a = new TreeMap<String, Object[]>();
	    a.put("1", new Object[] {1, 3});
	    a.forEach((k, v)->{
	    	System.out.println("Key: " + k + " & V: " + v);
	    });
	}

}
