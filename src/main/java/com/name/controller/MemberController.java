package com.name.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.name.serivce.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@PostMapping(value = "/userasdasdasd" )
	public String openMemberSave(Model model) {
		
		String name = "이름";
		
		model.addAttribute("n", name);
		
		return "name/save";
	}
	
	
	@GetMapping(value = "/userasdasdasdd" )
	public String openMembeasdasdrSave(Model model) {
		
		String name = "이름";
		
		model.addAttribute("n", name);
		
		return "name/save";
	}
	
	@GetMapping(value = "/user/{id}" )
	public String openMembeasdasdasdasdasdrSave(Model model, @PathVariable String id) {
		
		String name = "이름";
		
		model.addAttribute("n", name);
		
		return "name/save";
	}
	@DeleteMapping(value = "/user/{id}" )
	public String deleteMembeasdasdrSave(Model model, @PathVariable String id) {
		
		String name = "이름";
		
		model.addAttribute("n", name);
		
		return "name/save";
	}

}
