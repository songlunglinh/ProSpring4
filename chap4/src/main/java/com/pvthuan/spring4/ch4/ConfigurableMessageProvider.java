package com.pvthuan.spring4.ch4;

public class ConfigurableMessageProvider implements MessageProvider{
	private String message = "Huynh Ngoc Tu";
	public ConfigurableMessageProvider() {
	 }
	 public ConfigurableMessageProvider(String message) {
	 this.message = message;
	 }
	 public void setMessage(String message) {
	 this.message = message;
	 }
	 //@Override
	 public String getMessage() {
	 return message;
	 }
}
