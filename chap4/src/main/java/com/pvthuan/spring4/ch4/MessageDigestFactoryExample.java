package com.pvthuan.spring4.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MessageDigestFactoryExample {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:META-INF/spring/app-context-xml6.xml");
		ctx.refresh();
		MessageDigester digester = (MessageDigester) ctx.getBean("digester");
		digester.digest("Hello World!");
	}
}
