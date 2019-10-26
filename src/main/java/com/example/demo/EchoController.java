package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EchoController {

	@RequestMapping("/")
	public String index() {
		return "test/test";
	}
	
	@RequestMapping("/confirm")
	public String confirm(@ModelAttribute("msg") String arg) {
		System.out.println("msg:" + arg);
		return "test/test";
	}

    
    

}