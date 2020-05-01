package com.luv2code.springdemo.customAnnotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IfscCodeValidator implements ConstraintValidator<IfscCode,String>{
	
	
	private String prefixIfscCode;

	public void initialize(IfscCode ifscCode) {
		// value given in the annotation gets appended here
		this.prefixIfscCode = ifscCode.value();
	}

	@Override
	public boolean isValid(String str, ConstraintValidatorContext arg1) {
		boolean result;
		// str is the vbalue that the user enters in the field
		if (str != null) {
			result = str.startsWith(prefixIfscCode);
		} else {
			result = false;
		}
		
		return false;
	}
	
	

}
