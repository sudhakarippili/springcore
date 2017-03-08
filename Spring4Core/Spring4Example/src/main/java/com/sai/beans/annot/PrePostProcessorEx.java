package com.sai.beans.annot;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class PrePostProcessorEx implements InitializingBean, DisposableBean{

	
	@PostConstruct
	public void preConstructMethod(){
		System.out.println(" in post construct");
	}
	
	@PreDestroy
	public void postDestroyMethod(){
		System.out.println(" in pre destroy");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
