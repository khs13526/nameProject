package com.name.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.name.domain.Member;
import com.name.paging.Criteria;
import com.name.serivce.MemberService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class MemberApiController {

	final private MemberService memberService;
	
	@GetMapping(value = "/user" )
	public List<Member> openMemberSave(Model model, Criteria criteria) {
		System.out.println("===========================");
		System.out.println(criteria.toString());
		List<Member> pageSampleList =  memberService.pagingSample(criteria);
		
		return pageSampleList;
	}
	
	@PostMapping(value = "/user" )
	public String openMembeasdrSave(Model model, @RequestBody Member member) {
		
		memberService.save(member);
		
		return null;
	}
	
	
}
