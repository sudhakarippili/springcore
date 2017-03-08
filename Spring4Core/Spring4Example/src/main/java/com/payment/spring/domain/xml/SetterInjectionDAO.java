package com.payment.spring.domain.xml;


public class SetterInjectionDAO implements BeanNameAware{

	public void sayHello(String name) {
		System.out.println("Hello "+name);
	}
	
	public void init(){
		System.out.println("Inititalizing"+this.getClass().getName());
	}	
	
	public void destroy(){
		System.out.println("Destroying"+this.getClass().getName());
	}

}
