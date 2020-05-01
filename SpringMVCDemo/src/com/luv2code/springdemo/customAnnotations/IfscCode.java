package com.luv2code.springdemo.customAnnotations;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = IfscCodeValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RUNTIME)
public @interface IfscCode {
	
	
	public String value() default "";
	
	public String message() default"";
	
	public Class<?>[] groups() default {};
	
	public Class<? extends Payload>[] payload() default{};
}
