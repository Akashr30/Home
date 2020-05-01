package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springdemo.bean.Customer;

@Controller
@RequestMapping("/Customer")
public class CustomerController {
	
	@InitBinder
	public void initBinder(WebDataBinder wdb) {
		
		StringTrimmerEditor ste = new StringTrimmerEditor(true);
		wdb.registerCustomEditor(String.class, ste);
		
	}
	
	@RequestMapping("/signUp")
	public String customerSignUp(Model model) {
		
		model.addAttribute("Customer", new Customer());
		return "customerSignUp-form";
	}
	
	@RequestMapping("/addCustomer")
	public String addCustomer(
			@Valid @ModelAttribute("Customer") Customer customer,
			BindingResult bindingResult,Model model) {
		//"typeMismatch.Customer.freePass" in the customErrorMessages is thrown by the spring when there is a mismatch in the type of the field and the value in field..Hence the best one can be used in the properties file for thowing wrror msgs
		System.out.println(bindingResult);
		if (bindingResult.hasErrors()) {
			return "customerSignUp-form";
		} else {
			model.addAttribute("firstName", customer.getFirstName());
			model.addAttribute("lastName", customer.getLastName());
			model.addAttribute("freePass", customer.getFreePass());
			return "save-customer";
		}
	}

}
