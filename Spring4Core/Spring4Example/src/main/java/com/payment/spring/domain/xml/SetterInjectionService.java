package com.payment.spring.domain.xml;

public class SetterInjectionService {
	
	private CallBackMethodImpl callBackMethodImpl;
	
	
	public CallBackMethodImpl getCallBackMethodImpl() {
		return callBackMethodImpl;
	}

	public void setCallBackMethodImpl( CallBackMethodImpl callBackMethodImpl) {
		this.callBackMethodImpl = callBackMethodImpl;
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
