package com.pvthuan.spring4.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MessageDigestExample {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:META-INF/spring/app-context-xml5.xml");
		ctx.refresh();
		MessageDigester digester = (MessageDigester) ctx.getBean("digester");
		digester.digest("HuynhNgocTu");
	}
}
