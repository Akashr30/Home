package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.bean.Student;

@Controller
@RequestMapping("/Student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
//		model.addAttribute("student", new Student());
		Student student = new Student();
		model.addAttribute("student",student);
//		model.addAttribute("countryOptions",student.countryOptions);
		return "Student-form";
	}
	
	@RequestMapping("/saveForm")
	//The @Modelattribute binds the name given in the model attribute in the jsp page
	public String saveForm(@ModelAttribute("student") Student student,Model model) {	
		model.addAttribute("firstName",student.getFirstName());
		model.addAttribute("lastName",student.getLastName());
		model.addAttribute("country",student.getCountry());
		model.addAttribute("countryOptions",student.getCountryOptions());
		return "Save-Student";
	}
	

}
