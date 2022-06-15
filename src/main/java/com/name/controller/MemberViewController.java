package com.name.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.name.domain.Member;
import com.name.serivce.MemberService;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Controller
@RequestMapping("/view")
public class MemberViewController {
	final private MemberService memberService;
	
	@GetMapping(value = "/user" )
	public String openMemberSave(Model model) {
		List<Member> list =  memberService.findAll();
		
		model.addAttribute("list",list);
		return "name/save";
	}
}
