package com.pvthuan.test;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestListener {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:META-INF/test//applicationContext.xml");
		ctx.refresh();
		
		while (true) {
		}
	}
}