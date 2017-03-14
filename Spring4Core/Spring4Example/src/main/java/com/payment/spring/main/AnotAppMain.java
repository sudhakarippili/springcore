package com.payment.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.payment.beans.annot.AutowireByType;
import com.payment.beans.annot.SingletonDep;

public class AnotAppMain {

	public static void main(String args[]) {
	/*	AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
	*/	
		ApplicationContext context = new ClassPathXmlApplicationContext("AnnotBeans.xml"); 
		
		SingletonDep bean1 = (SingletonDep) context.getBean("singletonDep");
		SingletonDep bean2 = (SingletonDep) context.getBean("singletonDep");
		SingletonDep bean3 = (SingletonDep) context.getBean("singletonDep");
		
		bean1.displayHashCode();
		bean2.displayHashCode();
		bean3.displayHashCode();
		
		AutowireByType atwType = (AutowireByType) context.getBean("autowireByType");
		
		
	}

}
