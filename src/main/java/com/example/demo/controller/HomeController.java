package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Emp;
import com.example.demo.repo.EmpRepo;

@Controller
public class HomeController {
	@Autowired
	EmpRepo db;
	
	@RequestMapping("/")
	String fun(Model model)
	{
		
		Emp e=new Emp();
		model.addAttribute("obj",e);
		return "reg.html";
	}
	
	
	@RequestMapping("/reg")
	String fun2(@ModelAttribute("obj")Emp e)
	{
		
		System.out.println(e);
		db.save(e);
		
		return "done.html";
	}
	
	
	

}
