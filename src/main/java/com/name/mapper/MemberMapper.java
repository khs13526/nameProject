package com.name.mapper;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.name.domain.Member;
import com.name.paging.Criteria;

@Mapper

public interface MemberMapper {
	int save(Member member);
	Optional<Member> findById(Long idx);
	Optional<Member> findByName(String name);
	List<Member> findAll();
	
	
	Member findByOne();
	List<Member> pagingSample(Criteria criteria);
}
