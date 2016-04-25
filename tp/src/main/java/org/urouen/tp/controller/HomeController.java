package org.urouen.tp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	private static final String HELLO_WORLD_MSG = "hello world!";
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	@ResponseBody
	public String index() {
		return "Welcome page!";
	}
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	@ResponseBody
	public String test() {
		return "Test!";
	}
	
	@RequestMapping(value="/about", method=RequestMethod.GET)
	@ResponseBody
	public String about() {
		return RequestMethod.GET.name() + " " + HELLO_WORLD_MSG;
	}
	
	@RequestMapping(value="/about", method=RequestMethod.POST)
	@ResponseBody
	public String aboutPost() {
		return RequestMethod.POST.name() + " " + HELLO_WORLD_MSG;
	}
	
	

}
