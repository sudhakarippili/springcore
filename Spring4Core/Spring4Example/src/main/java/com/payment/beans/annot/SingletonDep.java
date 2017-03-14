package com.payment.beans.annot;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



/**
 * A @Scope annotation is used at the type level or at method level.
 * 
 *  If at type level then it has to be used in conjunction with either 
 *  	a @Component or @Configuration annotation.
 * If it is at method level, it should be used in conjunction with 
 *      a @Bean annotation.
 *  
 *  default is singleton
 *       
 * @author sippili
 *
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingletonDep {

	public void displayHashCode(){
		System.out.println("singleton dep::"+this.hashCode());
	}
}
