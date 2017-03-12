package com.sai.testing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sai.beans.xmlex.XMLStudent;

public class TestXML {

	public static void main(String[] args) {
		System.out.println("test");
		ApplicationContext context =
	             new ClassPathXmlApplicationContext("/XMLBeans.xml");	   
	     
	}
}
