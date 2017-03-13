package com.payment.spring.domain.xml;


//TODO 

/**
 * add a string,list,map
 * add a 
 * @author ADMIN
 *
 */

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
