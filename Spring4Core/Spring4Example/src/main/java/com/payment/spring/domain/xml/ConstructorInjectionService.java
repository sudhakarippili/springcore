package com.payment.spring.domain.xml;

public class ConstructorInjectionService {
	
	private String name;
	private CallBackMethodImpl callBackMethodImp;	
	
	
	public ConstructorInjectionService(String name,CallBackMethodImpl callBackMethodImp){
		this.name=name;
		this.callBackMethodImp=callBackMethodImp;
	}
	
	public ConstructorInjectionService(String name){
		this.name=name;		
	}
	
	public void init(){
		System.out.println("Inititalizing"+this.getClass().getName()+ "-- "+this.hashCode());
	}	
	
	public void destroy(){
		System.out.println("Destroying"+this.getClass().getName());
	}
	

}
