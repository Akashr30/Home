package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "HelloWorld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutOut(HttpServletRequest request , Model model) {
		
		String name = request.getParameter("studentName");
		
		String name1 = "Yo!!...."+name.toUpperCase();
		
		model.addAttribute("message",name1);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String name, Model model) {
		//The @Requestparam will be responsible for capturing values from request parameter
//		String name = request.getParameter("studentName"); 
		
		String name1 = "Yo!!....Hi from Version 3 .."+name.toUpperCase();
		
		model.addAttribute("message",name1);
		
		return "helloworld";
	}

}
