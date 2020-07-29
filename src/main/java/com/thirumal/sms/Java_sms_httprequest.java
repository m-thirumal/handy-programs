/**
 * 
 */
package com.thirumal.sms;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/**
 * @author thirumal
 *
 */
public class Java_sms_httprequest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String recipient = "+441234567890";
			String message = " Greetings from Thirumal! Have a fucking day!";
			String username = "admin";
			String password = "abc123";
			String originator = "+918892482627";

			String requestUrl = "http://127.0.0.1:9501/api?action=sendmessage&" + "username="
					+ URLEncoder.encode(username, "UTF-8") + "&password=" + URLEncoder.encode(password, "UTF-8")
					+ "&recipient=" + URLEncoder.encode(recipient, "UTF-8") + "&messagetype=SMS:TEXT" + "&messagedata="
					+ URLEncoder.encode(message, "UTF-8") + "&originator=" + URLEncoder.encode(originator, "UTF-8")
					+ "&serviceprovider=GSMModem1" + "&responseformat=html";

			URL url = new URL(requestUrl);
			HttpURLConnection uc = (HttpURLConnection) url.openConnection();
			System.out.println(uc.getResponseMessage());
			uc.disconnect();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
