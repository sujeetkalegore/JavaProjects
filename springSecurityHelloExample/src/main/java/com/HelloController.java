package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Kalegore
 *
 */
@Controller
public class HelloController {
	
	@RequestMapping(value={"/","/welcome**"},method=RequestMethod.GET)
	public String welcomePage(Model model){
		model.addAttribute("title","Welcome to spring security");
		model.addAttribute("message","This is welcome page");
		return"hello";
	}
	
	@RequestMapping(value={"/user**/admin**"},method=RequestMethod.GET)
	public String adminPage(Model model){
		model.addAttribute("title","Welcome to spring security admin page");
		model.addAttribute("message","This is protected page");
		return"admin";
	}
	
	@RequestMapping(value={"/user**"},method=RequestMethod.GET)
	public String userPage(Model model){
		model.addAttribute("title", "Welcome to Spring security user page");
		model.addAttribute("message", "This is User Page");
		return"user";
	}
	
}
