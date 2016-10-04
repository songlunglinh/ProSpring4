package com.pvthuan.spring4.ch3.xml;

public class HelloWorldMessageProvider implements MessageProvider{

	@Override
	public String getMessage() {
		return "Hello World ";
	}

}
