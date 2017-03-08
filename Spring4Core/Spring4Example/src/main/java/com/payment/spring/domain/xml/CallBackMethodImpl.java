package com.payment.spring.domain.xml;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;



/**
 * 1.Instantiate – The Spring container instantiates the bean
 * 2.Populate properties- Spring IoC container injects the bean’s properties
 * 3.Set Bean Name- BeanNameAware-setBeanName
 * 4.Pre Initialization-This stage is also called the bean postprocess
 * 5.Initialize beans -IntializingBean-afterPropertiesSet
 * 6.afterPropertiesSet - postProcessAfterinitalization
 * 7.Ready to Use
 * 8.Destroy -DisposableBean-destroy  
 */
public class CallBackMethodImpl implements InitializingBean,DisposableBean,BeanPostProcessor,BeanNameAware {

	//method of InitializingBean
	public void afterPropertiesSet() throws Exception {
		System.out.println(this.getClass().getName()+ " -- initializing");
		
	}
	//method of DisposableBean
	public void destroy(){
		System.out.println(this.getClass().getName()+ " -- Destroying");
	}
	
	//methods of BeanPostProcessor
	
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println(this.getClass().getName()+ " -- postProcessBeforeInitialization");
		return arg0;
	}
	
	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println(this.getClass().getName()+ " -- postProcessAfterInitialization ");
		return arg0;
	}
	public void setBeanName(String arg0) {
			System.out.println(this.getClass().getName()+" -- setBeanName ");
		
	}	
	
}
