package com.payment.beans.annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstrBeanAutowire {

	//constructor injection for objects
	SingletonDep dep1;
	
	@Autowired
	public ConstrBeanAutowire(SingletonDep dep1){
		System.out.println("in ConstrBeanAutowire constructor");
		dep1.displayHashCode();
	}
	
}
