package com.pvthuan.spring4.ch3.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
@Service("messageRenderer")
public class StandardOutMessageRenderer implements MessageRenderer {
	private MessageProvider messageProvider;

	@Override
	public void render() {
		if (messageProvider == null) {
			throw new RuntimeException(
					"You must set the property messageProvider of class:" + StandardOutMessageRenderer.class.getName());
		}
	}
	@Override
	@Autowired
	public void setMessageProvider(MessageProvider provider) {
		this.messageProvider = provider;
	}
	@Override
	@Autowired
	public MessageProvider getMessageProvider() {
		return this.messageProvider;
	}
}