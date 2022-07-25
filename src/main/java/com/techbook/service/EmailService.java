package com.techbook.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("emailService")
//public class EmailService implements MessageService  {
//	  public void sendMessage(String msg) {
			
			//System.out.println(msg +"recived  via email");
			
		//}
		
//}
@Component("emailService")
public class EmailService implements MessageService  {
public void sendMessage(String msg,String media) {
			
			System.out.println(msg +"recived  via "+media);
			
		}
		
}