package com.pvthuan.spring4.ch3.xml;

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
	public void setMessageProvider(MessageProvider provider) {
		this.messageProvider = provider;

	}

	@Override
	public MessageProvider getMessageProvider() {
		return messageProvider;
	}

}
