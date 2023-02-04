package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		Student  student = new Student();
		
		model.addAttribute("student",student);
		return "student-form";
		
		//NOTE theStudentmust match with the key"modelAttribute" in JSP page
	}
	
	//QUESTION>]? if we write loadForm then do we have change in Jsp amywhere ?
	//@RequestMapping("/loadForm")
	
	@RequestMapping("/processForm")
    public String processForm(@ModelAttribute("theStudent") Student student) {
		
		System.out.println("Student Data"+" "+ student.getFirstName()+"--"+student.getLastName()+"--"+student.getCountry());
		return "student-confirmation";
	}	
}
