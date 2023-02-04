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

@Controller
@RequestMapping("/customer")
public class CustomerController {

	

	//Step 3 hibernate
	@RequestMapping("/showForm")
    public String processForm(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer",customer);
		 return "customer-form";
	}
	
	@InitBinder
	public void binder(WebDataBinder  dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
	}
	
	@RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("customer") Customer customer,
    		BindingResult  bindingResult) {
		
		System.out.print("Last Name : |"+customer.getLastName()+"|");
		
		System.out.println("Binding Result"+"-----"+bindingResult);
		if(bindingResult.hasErrors()) {
		 return "customer-form";
		}
		else
		{
		 return "customer-confirmation";
		}
	}
	
}
