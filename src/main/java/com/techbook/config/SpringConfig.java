package com.techbook.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.techbook.controller.MessageController;
import com.techbook.service.MessageService;

@Configuration
@ComponentScan(value={"com.techbook.controller" ,"com.techbook.service"})// meaning com.techbook.controller jati pani class xa tyo sap..
@PropertySource(value = { "demo.properties" })

public class SpringConfig {
	// constructor injection hudha bean banairahanu pardaina
	//@Bean   
	//public MessageController getMessageconController() {
	//return new MessageController(); // service ko object return 
	//}
	// creating message service ben here.
	
	// hamilae message service lai pani conponent service banauna sakxau .it is not necessary to make bean 
	//@Bean
	//public MessageService getMessageService() {
	//	return new MessageService(); // service ko object return 
}
