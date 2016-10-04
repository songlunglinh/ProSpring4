package com.pvthuan.spring4.ch3.annotation;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
	public static void main(String[] args) {
		// error autowire
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:META-INF/spring/app-context-annotation.xml");
		ctx.refresh();
		MessageRenderer messageRenderer = ctx.getBean("messageRenderer",MessageRenderer.class);
		System.out.println(messageRenderer.getMessageProvider());;
	}
}
