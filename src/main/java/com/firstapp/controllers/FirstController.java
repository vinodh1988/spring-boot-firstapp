package com.firstapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.firstapp.services.DataService;

@Controller
@RequestMapping("/webapp")

public class FirstController {
  
	@Autowired
	DataService dservice;
	
	@RequestMapping("/first")
	public String doThis(ModelMap map) {
		map.addAttribute("programmer","Joseph");
		map.addAttribute("organization","ABC International INC");
		map.addAttribute("team",dservice.getTeam());
		return "home";
	}
	
	@RequestMapping("/page2")
	public String doThisToo() {
		return "home";
	}
	
	
}
