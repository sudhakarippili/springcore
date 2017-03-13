package com.payment.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.payment.spring.domain.xml.SpringCollections;


public class XMLAppMain {

	public static void main(String[] args) {
		
		//Core context factory
	/*	BeanFactory coreContext=new XmlBeanFactory(new ClassPathResource("ApplicationContext.xml") );
		SetterInjectionService gps=(SetterInjectionService)coreContext.getBean("globalPaymentService");
		System.out.println("gps-1 --"+gps.hashCode());
		SetterInjectionService gps1=(SetterInjectionService)coreContext.getBean("globalPaymentService");
		SetterInjectionService gps2=(SetterInjectionService)coreContext.getBean("globalPaymentService");
	*/	
		//ApplicationContext Factory
		ApplicationContext appContext = new ClassPathXmlApplicationContext("XMLBeansDef.xml"); 
		System.out.println("after object deletion");
		
		//collections
		SpringCollections collectionEx=(SpringCollections)appContext.getBean("springCollections");
		System.out.println("------"+collectionEx);
		
		
		
	}
}
