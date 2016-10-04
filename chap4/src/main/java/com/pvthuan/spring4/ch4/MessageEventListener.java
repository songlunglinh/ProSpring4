package com.pvthuan.spring4.ch4;

import java.lang.reflect.Method;

import org.springframework.context.ApplicationListener;

public class MessageEventListener implements ApplicationListener<MessageEvent> {
	@Override
	public void onApplicationEvent(MessageEvent event) {
		MessageEvent msgEvt = (MessageEvent) event;
		System.out.println("Received: " + msgEvt.getMessage());
	}
}
