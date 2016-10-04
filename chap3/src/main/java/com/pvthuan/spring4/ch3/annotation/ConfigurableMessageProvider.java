package com.pvthuan.spring4.ch3.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("messageProvider")
public class ConfigurableMessageProvider implements MessageProvider {
	private String message;

	@Autowired
	public ConfigurableMessageProvider(@Value("Configurable message This is message") String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}
}