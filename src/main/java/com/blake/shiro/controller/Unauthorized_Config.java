package com.blake.shiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Unauthorized_Config {
	
	@RequestMapping("/ng")
	public String ng(Model model){
		model.addAttribute("exception","Ȩ�޲���!");
		return "ex/unauthorized";
	}
	
	@RequestMapping("/main_forward")
	public String main(){
		return "main";
	}
}
