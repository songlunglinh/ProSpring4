package com.pvthuan.spring4.ch3.xml;

public class ConfigurableMessageProvider implements MessageProvider {
	private String message;

	public ConfigurableMessageProvider(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
