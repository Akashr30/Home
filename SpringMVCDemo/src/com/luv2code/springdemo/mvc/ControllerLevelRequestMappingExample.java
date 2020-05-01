package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/parentMapping")		// parent mapping
public class ControllerLevelRequestMappingExample {
	
	@RequestMapping("/showForm")	// sub-mapping
	public String showForm() {
		return "showForm";
	}

}
