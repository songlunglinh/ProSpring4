package com.pvthuan.spring4.ch3.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class InjectSimple {
	private String name;
	private int age;
	private float height;
	private boolean programmer;
	private Long ageInSeconds;

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:META-INF/spring/app-context-tmp3.xml");
		ctx.refresh();
		InjectSimple simple = (InjectSimple) ctx.getBean("injectSimple");
		System.out.println(simple);
	}

	public void setAgeInSeconds(Long ageInSeconds) {
		this.ageInSeconds = ageInSeconds;
	}

	public void setProgrammer(boolean programmer) {
		this.programmer = programmer;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void setName(String name) {
		this.name = name;
	}
}
