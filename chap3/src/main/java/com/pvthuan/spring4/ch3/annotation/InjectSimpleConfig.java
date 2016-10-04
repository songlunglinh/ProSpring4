package com.pvthuan.spring4.ch3.annotation;

import org.springframework.stereotype.Component;

@Component("injectSimpleConfig")
public class InjectSimpleConfig {
	private String name = "John Smith";
	private int age = 35;
	private float height = 1.78f;
	private boolean programmer = true;
	private Long ageInSeconds = 1103760000L;
}