package com.thirumal.sms;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.*;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

public class send_sms {
	
		static String working_key ;
	    static String sender_id;
		String mob_no;
		String message;

			public  void setparams(String apikey,String senderid)
			{ 
			    working_key	=	apikey;
			    sender_id	= 	senderid;
			}

			public String process_sms(String mob_no,String message) throws IOException, KeyManagementException, NoSuchAlgorithmException
			{   	
				message=URLEncoder.encode(message, "UTF-8");				
		        URL url = new URL("http://instantalerts.co/api/web/send?apikey="+"6288jfxl60472236t0zh2t8co75lz9049"+"&sender="+"ETICMS"
				+"&to="+"8973697871"+"&message="+"Case meeting is scheduled");
				//System.out.println("url look like " + url );
			    HttpURLConnection con = (HttpURLConnection) url.openConnection();
			    con.setRequestMethod("GET");
			    con.setDoOutput(true);
			    con.getOutputStream();
			    con.getInputStream();
			    BufferedReader rd;
			    String line;
	            String result = "";
	            rd = new BufferedReader(new InputStreamReader(con.getInputStream()));
	           while ((line = rd.readLine()) != null)
	            {
	               result += line;
	            }
		        rd.close(); 
		        System.out.println("Result is" + result);
				return result;				
			}
			
			public static void main(String str[]) throws KeyManagementException, NoSuchAlgorithmException, IOException {
				send_sms s = new send_sms();
				s.process_sms("", "");
			}
	
	     
}
