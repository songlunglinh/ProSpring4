package com.pvthuan.spring4.ch3.annotation;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents2 {
	public static void main(String[] args) {
	 GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
	 ctx.load("classpath:META-INF/spring/app-context-annotation2.xml");
	 ctx.refresh();
	 MessageProvider messageProvider = ctx.getBean("messageProvider",
	 MessageProvider.class);
	 System.out.println(messageProvider.getMessage());
}
}
