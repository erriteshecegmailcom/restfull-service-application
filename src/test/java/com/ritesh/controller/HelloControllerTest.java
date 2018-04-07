package com.ritesh.controller;

import org.junit.Before;
import org.junit.Test;

public class HelloControllerTest {
	
	HelloController helloController;
	
	@Before
	public void beforesetup() {
		helloController  = new HelloController();
	}
	
	@Test
	public void returnStaticNameTest() {
		helloController.returnStaticName();
	}
	
	@Test
	public void returnDynamicNameUsingPathVariableTest() {
		helloController.returnDynamicNameUsingPathVariable("Roop");
	}
	
	@Test
	public void returnDynamicNameUsingPathVariablParamTest() {
		helloController.returnDynamicNameUsingPathVariablParam("rishu");
	}
	
	@Test
	public void returnDynamicNameUsingPathVariableWithGetTest() {
		helloController.returnDynamicNameUsingPathVariableWithGet("hello");
	}
	
	@Test
	public void returnDynamicNameUsingPathVariableWithPost() {
		helloController.returnDynamicNameUsingPathVariableWithPost("Hi");
	}

}
