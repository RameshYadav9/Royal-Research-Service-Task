package com.ss.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
	
	@Value("${app.title}")
	private String appTitle;
	
	@GetMapping({"","/","/home"})
	public ModelAndView showHome() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		mv.addObject("pageTitle","Home page - Welcome All");
		mv.addObject("developers" , new String[] {"Ramesh","Rahul","atul"});
		return mv;
		
		
	}
	@GetMapping("/header")
	public String showHeader() {
		return "header";
	}
	@GetMapping("/footer")
	public String showFooter() {
		return "footer";
	}
	
	@GetMapping("/home")
	public ModelAndView sayHello(@RequestParam(name="salution",required=false,defaultValue="Mr.") String salut,
			@RequestParam(name="num",required=false, defaultValue="Anonymous") String userName) {
		return new ModelAndView("hello","msg","Hello, " + salut + userName);
	}
	

}
