package com.pvthuan.test2;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestJmsSender {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:META-INF/test/applicationContext2.xml");
		ctx.refresh();

		MyMessageSender sender = ctx.getBean("messageSender", MyMessageSender.class);
		String msg = "Huynh Ngoc Tu";
		sender.sendMessage(msg);
		System.out.println("message vua send " + msg);
	}
}