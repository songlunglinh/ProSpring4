package com.pvthuan.spring4.ch4;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SimpleBeanWithInterface implements InitializingBean {
	private static final String DEFAULT_NAME = "Luke Skywalker";
	private String name;
	private int age = Integer.MIN_VALUE;

	public SimpleBeanWithInterface() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SimpleBeanWithInterface(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static String getDefaultName() {
		return DEFAULT_NAME;
	}

	public void myInit() {
		System.out.println("My Init");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing bean");
		if (name == null) {
			System.out.println("Using default name");
			name = DEFAULT_NAME;
		}
		if (age == Integer.MIN_VALUE) {
			throw new IllegalArgumentException(
					"You must set the age property of any beans of type " + SimpleBeanWithInterface.class);
		}
	}

	public String toString() {
		return "Name: " + name + "\nAge: " + age;
	}

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:META-INF/spring/app-context-xml2.xml");
		ctx.refresh();
		SimpleBeanWithInterface simpleBean1 = getBean("simpleBean1", ctx);
		SimpleBeanWithInterface simpleBean2 = getBean("simpleBean2", ctx);
		SimpleBeanWithInterface simpleBean3 = getBean("simpleBean3", ctx);
	}

	private static SimpleBeanWithInterface getBean(String beanName, ApplicationContext ctx) {
		try {
			SimpleBeanWithInterface bean = (SimpleBeanWithInterface) ctx.getBean(beanName);
			System.out.println(bean);
			return bean;
		} catch (BeanCreationException ex) {
			System.out.println("An error occured in bean configuration: " + ex.getMessage());
			return null;
		}
	}
}
