package com.ritesh.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ritesh.application.Hello;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class HelloController {
	
	@RequestMapping("/returnName")
	public @ResponseBody String returnStaticName(){
		return "Hello world ..... This is ritesh";
	}
	
	@RequestMapping("/returnName/{name}")
	public @ResponseBody String returnDynamicNameUsingPathVariable(@PathVariable String name){
		return "Hello world ..... This is........"+ name;
	}
	
	@RequestMapping(value="/returnsName/{name}")
	public @ResponseBody String returnDynamicNameUsingPathVariablParam(@PathVariable("name") String name){
		return "Hello world ..... This is........"+ name;
	}
	
	@RequestMapping(value="/returnNameUsingGet/{name}", method =RequestMethod.GET)
	public @ResponseBody String returnDynamicNameUsingPathVariableWithGet(@PathVariable("name") String name){
		return "Hello world ..... This is"+ name;
	}
	
	@RequestMapping(value="/returnNameUsingPost", method = RequestMethod.POST)
	public @ResponseBody String returnDynamicNameUsingPathVariableWithPost(@RequestBody Hello name){
		return "Hello world ..... This is"+ name.getName();
	}

}
