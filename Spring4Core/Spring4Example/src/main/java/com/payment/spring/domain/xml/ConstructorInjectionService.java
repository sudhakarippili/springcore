package com.payment.spring.domain.xml;

public class ConstructorInjectionService {
	
	private String name;
	private CallBackMethodImpl address;
	
	
	public ConstructorInjectionService(String name,CallBackMethodImpl address){
		this.name=name;
		this.address=address;
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
