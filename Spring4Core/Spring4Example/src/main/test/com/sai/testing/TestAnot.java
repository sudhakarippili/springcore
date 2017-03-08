package com.sai.testing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sai.beans.annot.AnStudent;

public class TestAnot {

	public static void main(String[] args) {
	
		ApplicationContext context =
	             new ClassPathXmlApplicationContext("AnnotBeans.xml");
		
		/* Multifile content data
		 
		 ApplicationContext multiFilecontext =
				new ClassPathXmlApplicationContext(new String[] {"AnnotBeans.xml", "XMLBeans.xml"});
	*/
		
		AnStudent student = (AnStudent) context.getBean("AnStudent");	   
		System.out.println("Student name : "+student.getName());
		System.exit(0);
	}
}
