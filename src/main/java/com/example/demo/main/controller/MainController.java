package com.example.demo.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.main.vo.Member;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String main( Model model ) {
		
		Member m = new Member();
		m.setMemberId("mId");
		m.setMemberPw("mPw");
		
		model.addAttribute("m", m);
		
		return "main";
	}

}
