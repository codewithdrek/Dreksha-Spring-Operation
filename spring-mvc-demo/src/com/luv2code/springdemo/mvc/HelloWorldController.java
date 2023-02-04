package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloWorld-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@RequestParam("studentName") String studentName, Model m) {
		System.out.println(studentName);
		String result = "Student Info" + studentName;
		m.addAttribute("param", result);

		return "helloworld";
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShotDude(HttpServletRequest httpServletRequest, Model model) {

		String theName = httpServletRequest.getParameter("studentName");
		theName = theName.toUpperCase();

		String result = "YO" + theName;

		model.addAttribute("message", result);

		return "helloWorld";
	}

	@RequestMapping("/processEventFormThree")
	public String letTryNew(@RequestParam("studentName") String theName, Model model) {

		String result = "Version3" + theName;
		model.addAttribute("message", result);
		return "main-menu";
	}

	// humko uSA settle hona hia bas one line
	// tel body ko v imp
	// oil in hair v imp
	// Ragi
	// No rice
	// Morning :oats
	// Lunch fruit bowl Raggi roti
	// Dinn: Daliya

}
