package com.payment.beans.annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("autowireByType")
@Lazy
public class AutowireByType {

	@Autowired
	@Qualifier("singletonDep")
	SingletonDep singletonDep;

	public SingletonDep getSingletonDep() {
		return singletonDep;
	}

	public void setSingletonDep(SingletonDep singletonDep) {
		this.singletonDep = singletonDep;
	}
	
	
	
}
