package com.pvthuan.spring4.ch4;

public interface MessageRenderer {
	void render();

	void setMessageProvider(MessageProvider provider);

	MessageProvider getMessageProvider();
}
