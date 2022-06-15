package com.name.serivce;

import java.util.List;
import java.util.Optional;

import com.name.domain.Member;
import com.name.paging.Criteria;

public interface MemberService {
	int save(Member member);
	Optional<Member> findById(Long idx);
	Optional<Member> findByName(String name);
	List<Member> findAll();
	public Member findByOne();
	List<Member> pagingSample(Criteria criteria);
}
