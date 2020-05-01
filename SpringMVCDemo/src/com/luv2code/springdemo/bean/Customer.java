package com.luv2code.springdemo.bean;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.luv2code.springdemo.customAnnotations.CourseCode;
import com.luv2code.springdemo.customAnnotations.IfscCode;

public class Customer {
	
	private String firstName;
	
	@NotNull (message = "is required")
	@Size(min=1,message = "cannot be empty")
	private String lastName;
	
	/*@Min(value = 0 , message = "value must be greater than or equal to 0")
	@Max(value = 10 , message = "value must be less than or equal to 10")*/
//	@Pattern(regexp="^[0-9]" ,message = "Only Numbers allowed")
//	@Min(value = 0 , message = "value must be greater than or equal to 0")
	@NotNull(message = "is required")
//	@Size(min = 1,message = "is required")
	@Min(value = 1 , message = "value must be greater than or equal to 0")
	private Integer freePass;
	
	@NotNull(message = "postal code cannot be empty")
	@Pattern(regexp="^[0-9]",message = "only numbers are allowed")
	private String postalCode;
	
	//Custom Annotation
	@CourseCode
	private String courseCode;	
	//Custom Annotation
	@NotNull(message = "is required")
	@IfscCode(value = "SBI" , message = "fill in the field with your banks IFSC code")
	private String bankIfscCode;
	
	
	public String getBankIfscCode() {
		return bankIfscCode;
	}
	public void setBankIfscCode(String bankIfscCode) {
		this.bankIfscCode = bankIfscCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public Integer getFreePass() {
		return freePass;
	}
	public void setFreePass(Integer freePass) {
		this.freePass = freePass;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
