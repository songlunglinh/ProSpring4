package com.pvthuan.model;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {
	public static void main(String[] args) throws JsonProcessingException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:META-INF/hntvipapplicationContext.xml");
		Student st = (Student)ctx.getBean("student");
		ObjectMapper obj = new ObjectMapper();
		String test = obj.writeValueAsString(st);
		System.out.println(test);
	}
}
