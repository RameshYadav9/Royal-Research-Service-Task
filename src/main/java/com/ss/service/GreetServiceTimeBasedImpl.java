package com.ss.service;

import java.time.LocalTime;

import org.springframework.stereotype.Service;

import com.ss.service.GreetService;
@Service
public class GreetServiceTimeBasedImpl implements GreetService 
{

	@Override
	public String getGreeting() {
		int hour = LocalTime.now().getHour();
		String greeting = null;
		
		if (hour >= 4 && hour <12)
			greeting = "Good Morning";
		else if (hour >=12 && hour <=16)
			greeting = "Good Afternoon";
		else
			greeting = "Good Evening";
		return greeting;
	}

}
