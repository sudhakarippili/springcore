package com.payment.spring.domain.xml;

public class SetterInjectionService {
	
	private SetterInjectionDAO paymentDao;
	
	
	public SetterInjectionDAO getPaymentDao() {
		return paymentDao;
	}

	public void setPaymentDao(SetterInjectionDAO paymentDao) {
		this.paymentDao = paymentDao;
	}

	public void init(){
		System.out.println("Inititalizing"+this.getClass().getName());
	}	
	
	public void destroy(){
		System.out.println("Destroying"+this.getClass().getName());
	}
	
	public void sayHello(String name){
		System.out.println("say hello");	
	}
	
}
