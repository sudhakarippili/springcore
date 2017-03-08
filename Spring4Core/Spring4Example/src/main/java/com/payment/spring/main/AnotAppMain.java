package com.payment.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.payment.spring.configuration.HelloWorldConfig;
import com.payment.spring.domain.xml.SetterInjectionService;

public class AnotAppMain {

	public static void main(String args[]) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		SetterInjectionService bean = (SetterInjectionService) context.getBean("helloWorldBean");
		bean.sayHello("Spring 4");
		context.close();

	}

}
