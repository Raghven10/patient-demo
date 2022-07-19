package com.conva.patientdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

	 @RequestMapping("/")
	 public String welcome() {
	        return "index";
	 }
	 
	 @RequestMapping("/my-error")
	 public String error() {
	        return "index";
	 }
	 
	 @RequestMapping("/view")
	 public ModelAndView index () {
	     ModelAndView modelAndView = new ModelAndView();
	     modelAndView.setViewName("index");
	     return modelAndView;
	 }
}
