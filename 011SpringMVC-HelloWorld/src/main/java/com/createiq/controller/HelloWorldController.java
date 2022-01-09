package com.createiq.controller;

import javax.servlet.ServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public ModelAndView helloWorld() {
		return new ModelAndView("helloworld", "name", "Balaji");
	}

	@RequestMapping("/welcome")
	public ModelAndView welcome(@RequestParam("name") String name) {
		return new ModelAndView("welcome", "name", name);
	}

	@RequestMapping(value = "/sayHello", method = RequestMethod.POST)
	public ModelAndView sayHello(ServletRequest request) {
		String name = request.getParameter("name");
		return new ModelAndView("hello", "name", name);
	}

}
