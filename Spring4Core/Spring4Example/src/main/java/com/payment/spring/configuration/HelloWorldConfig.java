package com.payment.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import com.payment.spring.domain.xml.SetterInjectionDAO;
import com.payment.spring.domain.xml.SetterInjectionService;

@Configuration
public class HelloWorldConfig {

	@Bean(name="helloWorldBean")
	@Description("This is a sample HelloWorld Bean")
	public SetterInjectionService helloWorld() {
		return null;
	}

}
