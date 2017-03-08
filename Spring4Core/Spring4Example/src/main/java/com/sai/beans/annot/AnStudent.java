package com.sai.beans.annot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component("AnStudent")
@Lazy
public class AnStudent {
	
	private Long rollNo;
	
	@Value("Raghuvaran")
	private String name;
	
	public Long getRollNo() {
		return rollNo;
	}
	public void setRollNo(Long rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		System.out.println("inside the name");
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
