package com.techbook.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("textService")
@Primary
public class TextService implements MessageService {
	public void sendMessage(String msg,String media) {

		System.out.println( msg + "recived  via "+media);

	}
}
