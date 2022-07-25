package com.techbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.techbook.service.MessageService;

//messageservice lae direct intract gardaina test class sangha .. controller works as a mediator to intract with..
//test class  so controller lae messageservice clss lai call garnu paryo.

@Component
public class MessageController {
	@Value("${media}")
private String media;	
@Autowired // yaha autowired garda field injection haru garnu pardaina like setter and getter injection
@Qualifier("emailService")
//calling message service
private MessageService messageService;// message serviceko bean springConfig classma xa so tyo yaha ...
											// launa ko lagi 2ta qurry xa like setter , getter injection or constructor
// setter injection											// injection
//@Autowired  // autowired lae bean lai inject garauxa
//public void setMessageService(MessageService messageService) {
//this.messageService = messageService;
//	}


// constructor injection
//@Autowired  
//public MessageController(MessageService messageService) {
//this.messageService = messageService;
//	}


public void sendMessage(String msg) {
messageService.sendMessage(msg,media); // aslae afai logic lekdaina messageService bata call garxa

	}
}


// jasko mathi autowired lekhinxa tyo jaylae pani bean hunai parxa yaha mathi MessageService ko mathi autowired...
// lekhna milyo coz it is bean
// kunai pani bean lai call garnu parxa vanae tyo pani bena hunai parxa here messageController is bean so...
// we can call messageService 