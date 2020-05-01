package com.luv2code.springdemo.customAnnotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
	
	private String prefix;
	
	public void initialize(CourseCode courseCode ) {
		prefix = courseCode.value();
	} 
	
	
	@Override
	public boolean isValid(String fieldValue, ConstraintValidatorContext arg1) {
		
		boolean result;
		if (fieldValue != null) {
			result = fieldValue.startsWith(prefix);
		} else {
			result = true;
		}
		return result;
	}

}
