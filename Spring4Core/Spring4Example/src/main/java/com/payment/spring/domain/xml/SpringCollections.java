package com.payment.spring.domain.xml;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SpringCollections {

	List sampleList;
	Set  sampleSet;
	Map  sampleMap;
	Properties sampleProp;
	
	
	public List getSampleList() {
		return sampleList;
	}
	public void setSampleList(List sampleList) {
		this.sampleList = sampleList;
	}
	public Set getSampleSet() {
		return sampleSet;
	}
	public void setSampleSet(Set sampleSet) {
		this.sampleSet = sampleSet;
	}
	public Map getSampleMap() {
		return sampleMap;
	}
	public void setSampleMap(Map sampleMap) {
		this.sampleMap = sampleMap;
	}
	public Properties getSampleProp() {
		return sampleProp;
	}
	public void setSampleProp(Properties sampleProp) {
		this.sampleProp = sampleProp;
	}
	
	@Override
	public String toString(){
		String string=sampleList +" -- "+sampleMap+" -- "+sampleProp+" -- "+sampleSet;
		return string;		
	}
	
	
}
