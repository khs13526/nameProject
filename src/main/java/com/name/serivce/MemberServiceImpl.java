package com.name.serivce;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.name.domain.Member;
import com.name.mapper.MemberMapper;
import com.name.paging.Criteria;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
	
	
	final private MemberMapper memberMapper;

	@Override
	public int save(Member member) {
		return memberMapper.save(member);
	}

	@Override
	public Optional<Member> findById(Long idx) {
		memberMapper.findById(idx);
		return null;
	}

	@Override
	public Optional<Member> findByName(String name) {
		memberMapper.findByName(name);
		return null;
	}

	@Override
	public List<Member> findAll() {
//		memberMapper.findAll();
		return memberMapper.findAll();
	}
	
	@Override
	public Member findByOne() {
		
		return memberMapper.findByOne();
	}

	@Override
	public List<Member> pagingSample(Criteria criteria) {
		
		criteria.setStartPage((criteria.getCurrentPageNo()-1) * criteria.getRecordsPerPage());
		System.out.println("==============dsss=============");
		System.out.println(criteria.toString());
		return memberMapper.pagingSample(criteria);
	}

}
