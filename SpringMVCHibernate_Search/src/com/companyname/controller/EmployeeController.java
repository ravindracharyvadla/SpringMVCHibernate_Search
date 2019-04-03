package com.companyname.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.companyname.entity.Employee;
import com.companyname.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/searchLink", method = RequestMethod.GET)
	public String homePage()
	{
		return "searchPage";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String selectEmployees(@RequestParam("employeeId") int employeeId,Model model) {
		
		Employee employee=employeeService.searchById(employeeId);
		model.addAttribute("emp", employee);
		
		if(employee!=null){
				
		return "searchSuccessPage";
		
		}else{
			
			return "searchFailedPage";	
		}
		
		
		
	}
}
