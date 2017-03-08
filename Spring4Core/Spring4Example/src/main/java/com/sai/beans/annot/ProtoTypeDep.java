package com.sai.beans.annot;

import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class ProtoTypeDep {

	public void message(){
		System.out.println("ProtoTypeDep Hashcode::"+this.hashCode());
	}
}
