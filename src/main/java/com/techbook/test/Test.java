package com.techbook.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techbook.config.SpringConfig;
import com.techbook.controller.MessageController;
import com.techbook.service.MessageService;

public class Test {

	public static void main(String[] args) {
//MessageService messageService=new MessageService();// hami direct message service call gardainau spring....
	    
 //messageService.sendMessage("Hello "); // ko through garxaau
		
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);// yaha bean vako ...
		                                                                                     // class ko name dine 
	//MessageService messageService=context.getBean(MessageService.class);// hamilai message service...
	//messageService.sendMessage("Hello ");   // class ko bean linu xa so we pass messageservice on here 
		
		MessageController messageController=context.getBean(MessageController.class);
		messageController.sendMessage("Hello "); 
	}

}
