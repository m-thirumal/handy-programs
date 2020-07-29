/**
 * 
 */
package notification;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

/**
 * @author Thirumal
 *
 */
public class SMSNotification {
	 // Find your Account Sid and Token at twilio.com/user/account  
	public static final String ACCOUNT_SID = "ACa37cd3cac0d6ba94cd2225c3ecefc5ed";  
	public static final String AUTH_TOKEN = "60e1479a8e21d84656e2c72200bbae02";
	/**
	 * 
	 */
	public SMSNotification() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Twilio.init(ACCOUNT_SID, AUTH_TOKEN);  
		 Message message = Message      
				 .creator(new PhoneNumber("+16518675309"), new PhoneNumber("+14158141829"),      
						 "Tomorrow's forecast in Financial District, San Francisco is Clear")     
				 .setMediaUrl("https://climacons.herokuapp.com/clear.png")      
				 .create();   
		 System.out.println(message.getSid());
	}

}
