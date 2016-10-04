package com.pvthuan.spring4.ch2;

public class StandardOutMessageRenderer implements MessageRenderer{
	MessageProvider messageProvider;
	
	@Override
	public void render() {
		if (messageProvider == null) {
			 throw new RuntimeException(
			 "You must set the property messageProvider of class:"
			 + StandardOutMessageRenderer.class.getName());
			 }
			 System.out.println(messageProvider.getMessage());
	}

	@Override
	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;
	}

	@Override
	public MessageProvider getMessageProvider() {
		return this.messageProvider;
	}

}
