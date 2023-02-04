package com.luv2code.springdemo.mvc.Validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String>{

	private String coursePrefix;
	
	public void initialize(CourseCode theCourseCode) {
		coursePrefix=theCourseCode.value();
	}
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		
		boolean result = theCode.startsWith(coursePrefix);
		return false;
	}
}
