package com.fullstack.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SampleClass {
	
	@Autowired
	DummyClass1 class1;
	
	@Autowired(required=false)
	DummyClass2 class2;
	
	/*@Autowired
	DummyClass2 class3;
	
	@Autowired
	DummyClass2 class4;
	
	@Autowired
	DummyClass2 class5;*/
	
	/*public SampleClass(DummyClass1 class1,DummyClass2 class2,DummyClass2 class3,DummyClass2 class4,DummyClass2 class5) {
		// TODO Auto-generated constructor stub
	}*/
	
	void method1(){
		if(true) {
			
		}else {
			class2.toString();
		}
	}

	void method2() {
		
	}
}
