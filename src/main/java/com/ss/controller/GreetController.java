package com.ss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ss.service.GreetService;

@Controller
public class GreetController {
	//@Autowired
	private GreetService greetService;
	
	@Autowired
	public GreetController(GreetService greetService) {
		this.greetService = greetService;
	}
	
	@GetMapping("/greet")
	public ModelAndView showGreetPage(@RequestParam(name="unm", required=false) String userName) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("greet");
		
		if(userName != null) {
			mv.addObject("Greeting", greetService.getGreeting()+ " "+userName);
			
		}
		return mv;
		
	}

}
