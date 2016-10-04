package com.pvthuan.spring4.ch4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ImportResource(value = "classpath:META-INF/spring/app-context-annotation2.xml")
@PropertySource(value = "classpath:META-INF/spring/message.properties")
@ComponentScan(basePackages = { "com.pvthuan.spring4.ch4" })
@EnableTransactionManagement
public class AppConfig2 {
	
	@Autowired
	Environment env;

	@Bean
	@Lazy(value = true)
	public MessageProvider messageProvider() {
		return new ConfigurableMessageProvider(env.getProperty("message"));
	}

	@Bean(name = "messageRenderer")
	@Scope(value = "prototype")
	@DependsOn(value = "messageProvider")
	public MessageRenderer messageRenderer() {
		MessageRenderer renderer = new StandardOutMessageRenderer();
		renderer.setMessageProvider(messageProvider());
		return renderer;
	}
}